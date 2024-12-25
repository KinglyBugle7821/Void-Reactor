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

        // Slate blocks
        BlockStateModelGenerator.BlockTexturePool slatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.SLATE);
        slatePool.stairs(VRBlocks.SLATE_STAIRS);
        slatePool.slab(VRBlocks.SLATE_SLAB);
        slatePool.wall(VRBlocks.SLATE_WALL);
        slatePool.button(VRBlocks.SLATE_BUTTON);
        slatePool.pressurePlate(VRBlocks.SLATE_PRESSURE_PLATE);

        // Smooth Slate blocks
        BlockStateModelGenerator.BlockTexturePool smoothSlatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.SMOOTH_SLATE);
        smoothSlatePool.stairs(VRBlocks.SMOOTH_SLATE_STAIRS);
        smoothSlatePool.slab(VRBlocks.SMOOTH_SLATE_SLAB);
        smoothSlatePool.wall(VRBlocks.SMOOTH_SLATE_WALL);
        smoothSlatePool.button(VRBlocks.SMOOTH_SLATE_BUTTON);
        smoothSlatePool.pressurePlate(VRBlocks.SMOOTH_SLATE_PRESSURE_PLATE);

        // Cobbled Slate blocks
        BlockStateModelGenerator.BlockTexturePool cobbledSlatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.COBBLED_SLATE);
        cobbledSlatePool.stairs(VRBlocks.COBBLED_SLATE_STAIRS);
        cobbledSlatePool.slab(VRBlocks.COBBLED_SLATE_SLAB);
        cobbledSlatePool.wall(VRBlocks.COBBLED_SLATE_WALL);
        cobbledSlatePool.button(VRBlocks.COBBLED_SLATE_BUTTON);
        cobbledSlatePool.pressurePlate(VRBlocks.COBBLED_SLATE_PRESSURE_PLATE);

        // Slate Tile blocks
        BlockStateModelGenerator.BlockTexturePool slateTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.SLATE_TILE);
        slateTilePool.stairs(VRBlocks.SLATE_TILE_STAIRS);
        slateTilePool.slab(VRBlocks.SLATE_TILE_SLAB);
        slateTilePool.wall(VRBlocks.SLATE_TILE_WALL);
        slateTilePool.button(VRBlocks.SLATE_TILE_BUTTON);
        slateTilePool.pressurePlate(VRBlocks.SLATE_TILE_PRESSURE_PLATE);

        BlockStateModelGenerator.BlockTexturePool crackedSlateTilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.CRACKED_SLATE_TILE);
        crackedSlateTilePool.stairs(VRBlocks.CRACKED_SLATE_TILE_STAIRS);
        crackedSlateTilePool.slab(VRBlocks.CRACKED_SLATE_TILE_SLAB);
        crackedSlateTilePool.wall(VRBlocks.CRACKED_SLATE_TILE_WALL);
        crackedSlateTilePool.button(VRBlocks.CRACKED_SLATE_TILE_BUTTON);
        crackedSlateTilePool.pressurePlate(VRBlocks.CRACKED_SLATE_TILE_PRESSURE_PLATE);

        // Polished Slate blocks
        BlockStateModelGenerator.BlockTexturePool polishedSlatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.POLISHED_SLATE);
        polishedSlatePool.stairs(VRBlocks.POLISHED_SLATE_STAIRS);
        polishedSlatePool.slab(VRBlocks.POLISHED_SLATE_SLAB);
        polishedSlatePool.wall(VRBlocks.POLISHED_SLATE_WALL);
        polishedSlatePool.button(VRBlocks.POLISHED_SLATE_BUTTON);
        polishedSlatePool.pressurePlate(VRBlocks.POLISHED_SLATE_PRESSURE_PLATE);
        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.CHISELED_POLISHED_SLATE);

        BlockStateModelGenerator.BlockTexturePool crackedPolishedSlatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.CRACKED_POLISHED_SLATE);
        crackedPolishedSlatePool.stairs(VRBlocks.CRACKED_POLISHED_SLATE_STAIRS);
        crackedPolishedSlatePool.slab(VRBlocks.CRACKED_POLISHED_SLATE_SLAB);
        crackedPolishedSlatePool.wall(VRBlocks.CRACKED_POLISHED_SLATE_WALL);
        crackedPolishedSlatePool.button(VRBlocks.CRACKED_POLISHED_SLATE_BUTTON);
        crackedPolishedSlatePool.pressurePlate(VRBlocks.CRACKED_POLISHED_SLATE_PRESSURE_PLATE);

        // Slate Brick blocks
        BlockStateModelGenerator.BlockTexturePool slateBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.SLATE_BRICKS);
        slateBricksPool.stairs(VRBlocks.SLATE_BRICK_STAIRS);
        slateBricksPool.slab(VRBlocks.SLATE_BRICK_SLAB);
        slateBricksPool.wall(VRBlocks.SLATE_BRICK_WALL);
        slateBricksPool.button(VRBlocks.SLATE_BRICK_BUTTON);
        slateBricksPool.pressurePlate(VRBlocks.SLATE_BRICK_PRESSURE_PLATE);
        blockStateModelGenerator.registerSimpleCubeAll(VRBlocks.CHISELED_SLATE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool crackedSlateBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(VRBlocks.CRACKED_SLATE_BRICKS);
        crackedSlateBricksPool.stairs(VRBlocks.CRACKED_SLATE_BRICK_STAIRS);
        crackedSlateBricksPool.slab(VRBlocks.CRACKED_SLATE_BRICK_SLAB);
        crackedSlateBricksPool.wall(VRBlocks.CRACKED_SLATE_BRICK_WALL);
        crackedSlateBricksPool.button(VRBlocks.CRACKED_SLATE_BRICK_BUTTON);
        crackedSlateBricksPool.pressurePlate(VRBlocks.CRACKED_SLATE_BRICK_PRESSURE_PLATE);
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
