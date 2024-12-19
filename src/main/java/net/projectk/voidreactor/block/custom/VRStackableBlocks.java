package net.projectk.voidreactor.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class VRStackableBlocks extends Block{
    public static final IntProperty STACK_COUNT = IntProperty.of("stack_count", 1, 4);

    private static final VoxelShape[] SHAPES = new VoxelShape[]{
            VoxelShapes.cuboid(0.25, 0.0, 0.25, 0.75, 0.25, 0.75),
            VoxelShapes.cuboid(0.25, 0.0, 0.25, 0.75, 0.5, 0.75),
            VoxelShapes.cuboid(0.25, 0.0, 0.25, 0.75, 0.75, 0.75),
            VoxelShapes.fullCube()
    };

    public VRStackableBlocks(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(STACK_COUNT, 1));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STACK_COUNT);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(STACK_COUNT, 1);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES[state.get(STACK_COUNT) - 1];
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
}
