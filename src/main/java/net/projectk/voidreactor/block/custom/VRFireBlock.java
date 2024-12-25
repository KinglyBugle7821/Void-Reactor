package net.projectk.voidreactor.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.predicate.entity.DamageSourcePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.projectk.voidreactor.util.VRTags;

import static net.projectk.voidreactor.VoidReactor.DARKFIRE_DAMAGE_TYPE;

public class VRFireBlock extends FireBlock {
    public VRFireBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {

    }

    @Override
    protected void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (!world.getBlockState(pos.down()).isIn(VRTags.Blocks.CELESTIAL_BLOCKS)) {
            deleteBlock(world, pos);
        }
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isIn(VRTags.Blocks.CELESTIAL_BLOCKS);
    }

    private void deleteBlock(World world, BlockPos pos) {
        world.setBlockState(pos, Blocks.FIRE.getDefaultState());
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!canPlaceAt(state, world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return state;
    }
    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        super.onEntityCollision(state, world, pos, entity);
        if (!world.isClient && world instanceof ServerWorld serverWorld) {
            if (entity instanceof PlayerEntity player){
                if (!player.isCreative()){
                    Vec3d knockbackDirection = entity.getPos().subtract(Vec3d.ofCenter(pos)).normalize();
                    var registryManager = serverWorld.getRegistryManager();
                    var darkfireDamageType = registryManager.get(RegistryKeys.DAMAGE_TYPE)
                            .getEntry(DARKFIRE_DAMAGE_TYPE).orElseThrow();
                    DamageSource darkfireDamageSource = new DamageSource(darkfireDamageType);
                    float customDamage = 2.0F;

                    entity.damage(darkfireDamageSource, customDamage);
                    double knockbackStrength = 1;
                    entity.setVelocity(entity.getVelocity().add(knockbackDirection.multiply(knockbackStrength)));
                    entity.velocityModified = true;
                }
            }
            else if (entity instanceof ItemEntity item){
                Vec3d knockbackDirection = entity.getPos().subtract(Vec3d.ofCenter(pos)).normalize();
                var registryManager = serverWorld.getRegistryManager();
                var darkfireDamageType = registryManager.get(RegistryKeys.DAMAGE_TYPE)
                        .getEntry(DARKFIRE_DAMAGE_TYPE).orElseThrow();
                DamageSource darkfireDamageSource = new DamageSource(darkfireDamageType);
                float customDamage = 0.0F;

                entity.damage(darkfireDamageSource, customDamage);
                double knockbackStrength = 1;
                entity.setVelocity(entity.getVelocity().add(knockbackDirection.multiply(knockbackStrength)));
                entity.velocityModified = true;
            }
            else {
                Vec3d knockbackDirection = entity.getPos().subtract(Vec3d.ofCenter(pos)).normalize();
                var registryManager = serverWorld.getRegistryManager();
                var darkfireDamageType = registryManager.get(RegistryKeys.DAMAGE_TYPE)
                        .getEntry(DARKFIRE_DAMAGE_TYPE).orElseThrow();
                DamageSource darkfireDamageSource = new DamageSource(darkfireDamageType);
                float customDamage = 5.0F;

                entity.damage(darkfireDamageSource, customDamage);
                double knockbackStrength = 1;
                entity.setVelocity(entity.getVelocity().add(knockbackDirection.multiply(knockbackStrength)));
                entity.velocityModified = true;
            }
        }
        super.onEntityCollision(state, world, pos, entity);
    }
}
