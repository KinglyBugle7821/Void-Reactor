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
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.CELESTIAL_VINES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.CELESTIAL_TALL_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.DARKFIRE_BLOCK, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.RED_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.BLACK_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.BLUE_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.BROWN_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.GREEN_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.WHITE_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.LIME_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.PINK_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.CYAN_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.GRAY_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.RED_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.BLACK_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.BLUE_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.BROWN_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.GREEN_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.WHITE_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.LIME_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.PINK_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.CYAN_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.GRAY_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.RED_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.BLACK_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.BLUE_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.BROWN_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.GREEN_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.WHITE_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.LIME_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.PINK_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.CYAN_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.GRAY_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS_PANE, RenderLayer.getTranslucent());


        ParticleFactoryRegistry.getInstance().register(VRParticles.NEURON_SYNAPSE_FALLING_PARTICLE, NeuronSynapseFallingParticle.Factory::new);

    }
}
