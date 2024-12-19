package net.projectk.voidreactor.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class VRStackableBlocks extends HorizontalFacingBlock {
    public static final IntProperty STACK_COUNT = IntProperty.of("stack_count", 1, 4);
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    private static final VoxelShape[] SHAPES_NORTH = new VoxelShape[]{
            VoxelShapes.cuboid(0.0, 0.0, 0.0, 0.5, 0.1, 0.5),
            VoxelShapes.cuboid(0.0, 0.0, 0.0, 1.0, 0.1, 0.5),
            VoxelShapes.cuboid(0.0, 0.0, 0.0, 1.0, 0.1, 1.0),
            VoxelShapes.cuboid(0.0, 0.0, 0.0, 1.0, 0.1, 1.0)
    };
    private static final VoxelShape[] SHAPES_SOUTH = new VoxelShape[]{
            VoxelShapes.cuboid(0.5, 0.0, 0.5, 1.0, 0.1, 1.0),
            VoxelShapes.cuboid(0.0, 0.0, 0.5, 1.0, 0.1, 1.0),
            VoxelShapes.cuboid(0.0, 0.0, 0, 1.0, 0.1, 1.0),
            VoxelShapes.cuboid(0.0, 0.0, 0, 1.0, 0.1, 1.0)
    };
    private static final VoxelShape[] SHAPES_WEST = new VoxelShape[]{
            VoxelShapes.cuboid(0.0, 0.0, 0.5, 0.5, 0.1, 1.0),
            VoxelShapes.cuboid(0.0, 0.0, 0.0, 0.5, 0.1, 1.0),
            VoxelShapes.cuboid(0.0, 0.0, 0.0, 1.0, 0.1, 1.0),
            VoxelShapes.cuboid(0.0, 0.0, 0.0, 1.0, 0.1, 1.0),

    };
    private static final VoxelShape[] SHAPES_EAST = new VoxelShape[]{
            VoxelShapes.cuboid(0.5, 0.0, 0.0, 1.0, 0.1, 0.5),
            VoxelShapes.cuboid(0.5, 0.0, 0.0, 1.0, 0.1, 1.0),
            VoxelShapes.cuboid(0, 0.0, 0.0, 1.0, 0.1, 1.0),
            VoxelShapes.cuboid(0, 0.0, 0.0, 1.0, 0.1, 1.0)
    };

    public VRStackableBlocks(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(STACK_COUNT, 1));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STACK_COUNT);
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPES_NORTH[state.get(STACK_COUNT) - 1]; // SHAPE_NORTH
            case SOUTH:
                return SHAPES_SOUTH[state.get(STACK_COUNT) - 1]; // SHAPE_SOUTH
            case WEST:
                return SHAPES_WEST[state.get(STACK_COUNT) - 1]; // SHAPE_WEST
            case EAST:
                return SHAPES_EAST[state.get(STACK_COUNT) - 1]; // SHAPE_EAST
            default:
                return SHAPES_NORTH[state.get(STACK_COUNT) - 1]; // Default to NORTH
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        ItemStack heldItem = player.getMainHandStack(); // Use the main hand's stack.

        if (!heldItem.isEmpty() && heldItem.isOf(this.asItem())) {
            int currentCount = state.get(STACK_COUNT);
            if (currentCount < 4) { // Maximum stack size
                world.setBlockState(pos, state.with(STACK_COUNT, currentCount + 1), Block.NOTIFY_ALL);

                if (!player.getAbilities().creativeMode) {
                    heldItem.decrement(1);
                }
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }

    @Override
    protected List<ItemStack> getDroppedStacks(BlockState state, LootContextParameterSet.Builder builder) {
        int stackCount = state.get(STACK_COUNT);
        return Collections.singletonList(new ItemStack(this.asItem(), stackCount));
    }

    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        super.neighborUpdate(state, world, pos, block, fromPos, notify);
        checkSupport(state, world, pos);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        checkSupport(state, world, pos);
    }

    private void checkSupport(BlockState state, World world, BlockPos pos) {
        if (!world.getBlockState(pos.down()).isSideSolidFullSquare(world, pos.down(), net.minecraft.util.math.Direction.UP)) {
            world.breakBlock(pos, true); // Breaks the block and drops items.
        }
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isSideSolidFullSquare(world, pos.down(), net.minecraft.util.math.Direction.UP);
    }
}
