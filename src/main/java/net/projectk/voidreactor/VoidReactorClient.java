package net.projectk.voidreactor;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;
import net.projectk.voidreactor.block.VRBlocks;
import net.projectk.voidreactor.particle.VRParticles;
import net.projectk.voidreactor.particle.custom.NeuronSynapseFallingParticle;

public class VoidReactorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.AXON_SPROUT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.NEURON_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.NEURON_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.CELESTIAL_GRASS_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.CELESTIAL_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.CELESTIAL_DECAY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.NEURON_AXON, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.NEURON_SYNAPSE, RenderLayer.getCutout());

        ParticleFactoryRegistry.getInstance().register(VRParticles.NEURON_SYNAPSE_FALLING_PARTICLE, NeuronSynapseFallingParticle.Factory::new);

    }
}
