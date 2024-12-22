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

        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.DARKFIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.GENERO_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.CYMIN_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.GENERO_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.CYMIN_BLOCK);

        BlockStateModelGenerator.BlockTexturePool neuronPool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.NEURON_PLANKS);

        blockStateModelGenerator.registerSingleton(VRBlocks.NEURON_SYNAPSE, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(VRBlocks.AXON_SPROUT, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerTintableCrossBlockState(VRBlocks.CELESTIAL_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.CELESTIAL_DIRT);

        BlockStateModelGenerator.BlockTexturePool celestialStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.CELESTIAL_STONE);
        BlockStateModelGenerator.BlockTexturePool smoothCelestialStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.SMOOTH_CELESTIAL_STONE);
        smoothCelestialStonePool.slab(VRBlocks.SMOOTH_CELESTIAL_STONE_SLAB);
        celestialStonePool.stairs(VRBlocks.CELESTIAL_STONE_STAIRS);
        celestialStonePool.slab(VRBlocks.CELESTIAL_STONE_SLAB);

        BlockStateModelGenerator.BlockTexturePool celestialCobblestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.CELESTIAL_COBBLESTONE);
        celestialCobblestonePool.stairs(VRBlocks.CELESTIAL_COBBLESTONE_STAIRS);
        celestialCobblestonePool.slab(VRBlocks.CELESTIAL_COBBLESTONE_SLAB);
        celestialCobblestonePool.wall(VRBlocks.CELESTIAL_COBBLESTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool celestialStoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.CELESTIAL_STONE_BRICKS);
        celestialStoneBricksPool.stairs(VRBlocks.CELESTIAL_STONE_BRICK_STAIRS);
        celestialStoneBricksPool.slab(VRBlocks.CELESTIAL_STONE_BRICK_SLAB);
        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.CRACKED_CELESTIAL_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.CHISELED_CELESTIAL_STONE_BRICKS);
        celestialStoneBricksPool.wall(VRBlocks.CELESTIAL_STONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool mossyCelestialCobblestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE);
        mossyCelestialCobblestonePool.stairs(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE_STAIRS);
        mossyCelestialCobblestonePool.slab(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE_SLAB);
        mossyCelestialCobblestonePool.wall(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool mossyCelestialStoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.MOSSY_CELESTIAL_STONE_BRICKS);
        mossyCelestialStoneBricksPool.stairs(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_STAIRS);
        mossyCelestialStoneBricksPool.slab(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_SLAB);
        mossyCelestialStoneBricksPool.wall(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_WALL);

        neuronPool.stairs(VRBlocks.NEURON_STAIRS);
        neuronPool.slab(VRBlocks.NEURON_SLAB);

        neuronPool.button(VRBlocks.NEURON_BUTTON);
        neuronPool.pressurePlate(VRBlocks.NEURON_PRESSURE_PLATE);

        neuronPool.fence(VRBlocks.NEURON_FENCE);
        neuronPool.fenceGate(VRBlocks.NEURON_FENCE_GATE);

        blockStateModelGenerator.registerDoor(VRBlocks.NEURON_DOOR);
        blockStateModelGenerator.registerTrapdoor(VRBlocks.NEURON_TRAPDOOR);

//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.RED_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.BLACK_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.BLUE_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.BROWN_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.GREEN_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.WHITE_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.LIME_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.PINK_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.CYAN_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.GRAY_STAINED_REINFORCED_GLASS);
//        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS);

        blockStateModelGenerator.registerGlassPane(VRBlocks.REINFORCED_GLASS, VRBlocks.REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.RED_STAINED_REINFORCED_GLASS, VRBlocks.RED_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.BLACK_STAINED_REINFORCED_GLASS, VRBlocks.BLACK_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.BLUE_STAINED_REINFORCED_GLASS, VRBlocks.BLUE_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.BROWN_STAINED_REINFORCED_GLASS, VRBlocks.BROWN_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.GREEN_STAINED_REINFORCED_GLASS, VRBlocks.GREEN_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.WHITE_STAINED_REINFORCED_GLASS, VRBlocks.WHITE_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS, VRBlocks.YELLOW_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS, VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS, VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.LIME_STAINED_REINFORCED_GLASS, VRBlocks.LIME_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS, VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS, VRBlocks.ORANGE_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.PINK_STAINED_REINFORCED_GLASS, VRBlocks.PINK_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.CYAN_STAINED_REINFORCED_GLASS, VRBlocks.CYAN_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.GRAY_STAINED_REINFORCED_GLASS, VRBlocks.GRAY_STAINED_REINFORCED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS, VRBlocks.PURPLE_STAINED_REINFORCED_GLASS_PANE);
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
