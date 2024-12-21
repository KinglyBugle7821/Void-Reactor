package net.projectk.voidreactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.projectk.voidreactor.block.VRBlocks;
import net.projectk.voidreactor.item.VRItems;

public class VRModelProvider extends FabricModelProvider {
    public VRModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerLog(VRBlocks.NEURON_AXON).log(VRBlocks.NEURON_AXON).wood(VRBlocks.NEURON_MYELIN);
        blockStateModelGenerator.registerLog(VRBlocks.STRIPPED_NEURON_AXON).log(VRBlocks.STRIPPED_NEURON_AXON).wood(VRBlocks.STRIPPED_NEURON_MYELIN);

        blockStateModelGenerator.registerLog(VRBlocks.CELESTIAL_STONE).log(VRBlocks.CELESTIAL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.CELESTIAL_COBBLESTONE);


        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.DARKFIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.GENERO_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.CYMIN_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.DARKFIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.GENERO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.CYMIN_BLOCK);

        BlockStateModelGenerator.BlockTexturePool neuronPool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.NEURON_PLANKS);

        blockStateModelGenerator.registerSingleton(VRBlocks.NEURON_SYNAPSE, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(VRBlocks.AXON_SPROUT, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerTintableCrossBlockState(VRBlocks.CELESTIAL_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.CELESTIAL_DIRT);

        neuronPool.stairs(VRBlocks.NEURON_STAIRS);
        neuronPool.slab(VRBlocks.NEURON_SLAB);

        neuronPool.button(VRBlocks.NEURON_BUTTON);
        neuronPool.pressurePlate(VRBlocks.NEURON_PRESSURE_PLATE);

        neuronPool.fence(VRBlocks.NEURON_FENCE);
        neuronPool.fenceGate(VRBlocks.NEURON_FENCE_GATE);

        blockStateModelGenerator.registerDoor(VRBlocks.NEURON_DOOR);
        blockStateModelGenerator.registerTrapdoor(VRBlocks.NEURON_TRAPDOOR);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(VRBlocks.AXON_SPROUT.asItem(), Models.GENERATED);
        itemModelGenerator.register(VRBlocks.CELESTIAL_GRASS.asItem(), Models.GENERATED);
        itemModelGenerator.register(VRBlocks.CELESTIAL_DECAY.asItem(), Models.GENERATED);

        itemModelGenerator.register(VRItems.DARKFIRE_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(VRItems.GENERO_PLASMA, Models.GENERATED);
        itemModelGenerator.register(VRItems.CYMIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(VRItems.RAW_CYMIN, Models.GENERATED);
        itemModelGenerator.register(VRItems.CYMIN_NUGGET, Models.GENERATED);
    }
}
