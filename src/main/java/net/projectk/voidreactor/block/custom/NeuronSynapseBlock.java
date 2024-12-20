package net.projectk.voidreactor.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.projectk.voidreactor.particle.VRParticles;

public class NeuronSynapseBlock extends LeavesBlock {
    public NeuronSynapseBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);

        if (!world.isClient) {
            return; // Only spawn particles on the client side
        }

        // Control the spawn frequency
        if (random.nextDouble() < 0.1) { // Adjust the probability here (e.g., 0.1 = 10%)
            // Spawn falling particle, similar to cherry blossoms
            double x = pos.getX() + random.nextDouble(); // Random x within the block
            double y = pos.getY() - 0.1; // Slightly above the block
            double z = pos.getZ() + random.nextDouble(); // Random z within the block

            // Simulate cherry blossom drift
            double velocityX = (random.nextDouble() - 0.5) * 0.01; // Gentle horizontal drift
            double velocityY = -1; // Slow downward velocity
            double velocityZ = (random.nextDouble() - 0.5) * 0.01; // Gentle horizontal drift

            world.addParticle(
                    VRParticles.NEURON_SYNAPSE_FALLING_PARTICLE, // Replace with your particle type
                    x, y, z,
                    velocityX, velocityY, velocityZ
            );
        }
    }
}
