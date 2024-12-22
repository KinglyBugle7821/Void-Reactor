package net.projectk.voidreactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.projectk.voidreactor.block.VRBlocks;
import net.projectk.voidreactor.util.VRTags;

import java.util.concurrent.CompletableFuture;

public class VRBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public VRBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        /*
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BLOCK);
         */
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(VRBlocks.NEURON_AXON)
                .add(VRBlocks.NEURON_MYELIN)
                .add(VRBlocks.STRIPPED_NEURON_AXON)
                .add(VRBlocks.STRIPPED_NEURON_MYELIN)

                .add(VRBlocks.NEURON_PLANKS)
                .add(VRBlocks.NEURON_SYNAPSE);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS).add(VRBlocks.NEURON_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).add(VRBlocks.NEURON_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS).add(VRBlocks.NEURON_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS).add(VRBlocks.NEURON_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES).add(VRBlocks.NEURON_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(VRBlocks.NEURON_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(VRBlocks.NEURON_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(VRBlocks.CELESTIAL_GRASS_BLOCK)
                .add(VRBlocks.CELESTIAL_DIRT);
        getOrCreateTagBuilder(BlockTags.CLIMBABLE).add(VRBlocks.CELESTIAL_VINES);
        getOrCreateTagBuilder(VRTags.Blocks.CELESTIAL_BLOCKS)
                .add(VRBlocks.CELESTIAL_COBBLESTONE)
                .add(VRBlocks.CELESTIAL_STONE)
                .add(VRBlocks.CELESTIAL_GRASS)
                .add(VRBlocks.CELESTIAL_DECAY)
                .add(VRBlocks.CELESTIAL_TALL_GRASS)
                .add(VRBlocks.CELESTIAL_DIRT)
                .add(VRBlocks.CELESTIAL_GRASS_BLOCK)
                .add(VRBlocks.CELESTIAL_VINES)
                .add(VRBlocks.NEURON_TRAPDOOR)
                .add(VRBlocks.NEURON_STAIRS)
                .add(VRBlocks.NEURON_SLAB)
                .add(VRBlocks.NEURON_DOOR)
                .add(VRBlocks.NEURON_BUTTON)
                .add(VRBlocks.NEURON_PLANKS)
                .add(VRBlocks.NEURON_PRESSURE_PLATE)
                .add(VRBlocks.NEURON_FENCE_GATE)
                .add(VRBlocks.NEURON_FENCE)
                .add(VRBlocks.NEURON_SYNAPSE)
                .add(VRBlocks.NEURON_MYELIN)
                .add(VRBlocks.NEURON_AXON)
                .add(VRBlocks.STRIPPED_NEURON_MYELIN)
                .add(VRBlocks.STRIPPED_NEURON_AXON);
    }
}
