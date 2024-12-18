package net.projectk.voidreactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.projectk.voidreactor.block.VRBlocks;

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

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(VRBlocks.NEURON_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(VRBlocks.NEURON_FENCE_GATE);
    }
}
