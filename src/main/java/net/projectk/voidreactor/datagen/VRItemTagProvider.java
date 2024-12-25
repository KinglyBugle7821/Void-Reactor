package net.projectk.voidreactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.projectk.voidreactor.block.VRBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class VRItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public VRItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(VRBlocks.NEURON_AXON.asItem())
                .add(VRBlocks.NEURON_MYELIN.asItem())
                .add(VRBlocks.STRIPPED_NEURON_AXON.asItem())
                .add(VRBlocks.STRIPPED_NEURON_MYELIN.asItem());
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(VRBlocks.NEURON_PLANKS.asItem());
        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(VRBlocks.SLATE.asItem())
                .add(VRBlocks.CELESTIAL_STONE.asItem());
        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(VRBlocks.COBBLED_SLATE.asItem())
                .add(VRBlocks.CELESTIAL_COBBLESTONE.asItem());
    }
}
