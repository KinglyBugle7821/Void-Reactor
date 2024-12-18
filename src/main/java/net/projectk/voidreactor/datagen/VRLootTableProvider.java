package net.projectk.voidreactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.projectk.voidreactor.block.VRBlocks;

import java.util.concurrent.CompletableFuture;

public class VRLootTableProvider extends FabricBlockLootTableProvider {
    public VRLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(VRBlocks.NEURON_AXON);
        addDrop(VRBlocks.NEURON_MYELIN);
        addDrop(VRBlocks.STRIPPED_NEURON_AXON);
        addDrop(VRBlocks.STRIPPED_NEURON_MYELIN);

        addDrop(VRBlocks.NEURON_PLANKS);
        addDrop(VRBlocks.AXON_SPROUT);

        addDrop(VRBlocks.NEURON_STAIRS);
        addDrop(VRBlocks.NEURON_SLAB, slabDrops(VRBlocks.NEURON_SLAB));
        addDrop(VRBlocks.NEURON_PRESSURE_PLATE);
        addDrop(VRBlocks.NEURON_FENCE);
        addDrop(VRBlocks.NEURON_FENCE_GATE);
        addDrop(VRBlocks.NEURON_DOOR, doorDrops(VRBlocks.NEURON_DOOR));
        addDrop(VRBlocks.NEURON_TRAPDOOR);
        addDrop(VRBlocks.NEURON_SIGN);
        addDrop(VRBlocks.NEURON_HANGING_SIGN);

        addDrop(VRBlocks.NEURON_SYNAPSE, leavesDrops(VRBlocks.NEURON_SYNAPSE, VRBlocks.AXON_SPROUT, 0.0625f));

        //addDrop(VRBlocks.BlockName, oreDrops(BlockName, ItemName));
    }
}
