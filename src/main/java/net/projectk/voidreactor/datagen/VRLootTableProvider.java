package net.projectk.voidreactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.projectk.voidreactor.block.VRBlocks;
import net.projectk.voidreactor.item.VRItems;

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

        addDrop(VRBlocks.CELESTIAL_GRASS_BLOCK, oreDrops(VRBlocks.CELESTIAL_GRASS_BLOCK, VRBlocks.CELESTIAL_DIRT.asItem()));
        addDrop(VRBlocks.CELESTIAL_DIRT);

        addDrop(VRBlocks.CELESTIAL_STONE, oreDrops(VRBlocks.CELESTIAL_STONE, VRBlocks.CELESTIAL_COBBLESTONE.asItem()));
        addDrop(VRBlocks.SMOOTH_CELESTIAL_STONE_SLAB, slabDrops(VRBlocks.SMOOTH_CELESTIAL_STONE_SLAB));
        addDrop(VRBlocks.SMOOTH_CELESTIAL_STONE);
        addDrop(VRBlocks.CELESTIAL_STONE_STAIRS);
        addDrop(VRBlocks.CELESTIAL_STONE_SLAB);

        addDrop(VRBlocks.CELESTIAL_COBBLESTONE);
        addDrop(VRBlocks.CELESTIAL_COBBLESTONE_STAIRS);
        addDrop(VRBlocks.CELESTIAL_COBBLESTONE_SLAB, slabDrops(VRBlocks.SMOOTH_CELESTIAL_STONE_SLAB));
        addDrop(VRBlocks.CELESTIAL_COBBLESTONE_WALL);

        addDrop(VRBlocks.CELESTIAL_STONE_BRICKS);
        addDrop(VRBlocks.CELESTIAL_STONE_BRICK_STAIRS);
        addDrop(VRBlocks.CELESTIAL_STONE_BRICK_SLAB, slabDrops(VRBlocks.SMOOTH_CELESTIAL_STONE_SLAB));
        addDrop(VRBlocks.CRACKED_CELESTIAL_STONE_BRICKS);
        addDrop(VRBlocks.CHISELED_CELESTIAL_STONE_BRICKS);
        addDrop(VRBlocks.CELESTIAL_STONE_BRICK_WALL);

        addDrop(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE);
        addDrop(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE_STAIRS);
        addDrop(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE_SLAB, slabDrops(VRBlocks.SMOOTH_CELESTIAL_STONE_SLAB));
        addDrop(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE_WALL);

        addDrop(VRBlocks.MOSSY_CELESTIAL_STONE_BRICKS);
        addDrop(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_STAIRS);
        addDrop(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_SLAB, slabDrops(VRBlocks.SMOOTH_CELESTIAL_STONE_SLAB));
        addDrop(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_WALL);

        addDrop(VRBlocks.DARKFIRE_ORE, oreDrops(VRBlocks.DARKFIRE_ORE, VRItems.DARKFIRE_ESSENCE));
        addDrop(VRBlocks.GENERO_ORE, oreDrops(VRBlocks.GENERO_ORE, VRItems.GENERO_PLASMA));
        addDrop(VRBlocks.CYMIN_ORE, oreDrops(VRBlocks.CYMIN_ORE, VRItems.RAW_CYMIN));

        addDrop(VRBlocks.NEURON_STAIRS);
        addDrop(VRBlocks.NEURON_SLAB, slabDrops(VRBlocks.NEURON_SLAB));
        addDrop(VRBlocks.NEURON_PRESSURE_PLATE);
        addDrop(VRBlocks.NEURON_FENCE);
        addDrop(VRBlocks.NEURON_FENCE_GATE);
        addDrop(VRBlocks.NEURON_DOOR, doorDrops(VRBlocks.NEURON_DOOR));
        addDrop(VRBlocks.NEURON_TRAPDOOR);
        addDrop(VRBlocks.NEURON_BUTTON);

        addDrop(VRBlocks.REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.REINFORCED_GLASS));
        addDrop(VRBlocks.RED_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.RED_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.BLACK_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.BLACK_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.BLUE_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.BLUE_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.BROWN_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.BROWN_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.GREEN_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.GREEN_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.WHITE_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.WHITE_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.LIME_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.LIME_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.PINK_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.PINK_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.CYAN_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.CYAN_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.GRAY_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.GRAY_STAINED_REINFORCED_GLASS));
        addDrop(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS, dropsWithSilkTouch(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS));

        addDrop(VRBlocks.REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.RED_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.RED_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.BLACK_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.BLACK_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.BLUE_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.BLUE_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.BROWN_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.BROWN_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.GREEN_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.GREEN_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.WHITE_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.WHITE_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.LIME_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.LIME_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.PINK_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.PINK_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.CYAN_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.CYAN_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.GRAY_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.GRAY_STAINED_REINFORCED_GLASS_PANE));
        addDrop(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS_PANE, dropsWithSilkTouch(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS_PANE));

        addDrop(VRBlocks.SLATE, oreDrops(VRBlocks.SLATE, VRBlocks.COBBLED_SLATE.asItem()));
        addDrop(VRBlocks.SLATE_STAIRS);
        addDrop(VRBlocks.SLATE_SLAB, slabDrops(VRBlocks.SLATE_SLAB));
        addDrop(VRBlocks.SLATE_WALL);

        addDrop(VRBlocks.SMOOTH_SLATE);
        addDrop(VRBlocks.SMOOTH_SLATE_STAIRS);
        addDrop(VRBlocks.SMOOTH_SLATE_SLAB, slabDrops(VRBlocks.SMOOTH_SLATE_SLAB));
        addDrop(VRBlocks.SMOOTH_SLATE_WALL);

        addDrop(VRBlocks.COBBLED_SLATE);
        addDrop(VRBlocks.COBBLED_SLATE_STAIRS);
        addDrop(VRBlocks.COBBLED_SLATE_SLAB, slabDrops(VRBlocks.COBBLED_SLATE_SLAB));
        addDrop(VRBlocks.COBBLED_SLATE_WALL);

        addDrop(VRBlocks.SLATE_TILE);
        addDrop(VRBlocks.SLATE_TILE_STAIRS);
        addDrop(VRBlocks.SLATE_TILE_SLAB, slabDrops(VRBlocks.SLATE_TILE_SLAB));
        addDrop(VRBlocks.SLATE_TILE_WALL);
        addDrop(VRBlocks.CHISELED_SLATE_TILE);
        addDrop(VRBlocks.CRACKED_SLATE_TILE);
        addDrop(VRBlocks.CRACKED_SLATE_TILE_STAIRS);
        addDrop(VRBlocks.CRACKED_SLATE_TILE_SLAB, slabDrops(VRBlocks.CRACKED_SLATE_TILE_SLAB));
        addDrop(VRBlocks.CRACKED_SLATE_TILE_WALL);

        addDrop(VRBlocks.POLISHED_SLATE);
        addDrop(VRBlocks.POLISHED_SLATE_STAIRS);
        addDrop(VRBlocks.POLISHED_SLATE_SLAB, slabDrops(VRBlocks.POLISHED_SLATE_SLAB));
        addDrop(VRBlocks.POLISHED_SLATE_WALL);
        addDrop(VRBlocks.CHISELED_POLISHED_SLATE);
        addDrop(VRBlocks.CRACKED_POLISHED_SLATE);
        addDrop(VRBlocks.CRACKED_POLISHED_SLATE_STAIRS);
        addDrop(VRBlocks.CRACKED_POLISHED_SLATE_SLAB, slabDrops(VRBlocks.CRACKED_POLISHED_SLATE_SLAB));
        addDrop(VRBlocks.CRACKED_POLISHED_SLATE_WALL);

        addDrop(VRBlocks.SLATE_BRICKS);
        addDrop(VRBlocks.SLATE_BRICK_STAIRS);
        addDrop(VRBlocks.SLATE_BRICK_SLAB, slabDrops(VRBlocks.SLATE_BRICK_SLAB));
        addDrop(VRBlocks.SLATE_BRICK_WALL);
        addDrop(VRBlocks.CHISELED_SLATE_BRICKS);
        addDrop(VRBlocks.CRACKED_SLATE_BRICKS);
        addDrop(VRBlocks.CRACKED_SLATE_BRICK_STAIRS);
        addDrop(VRBlocks.CRACKED_SLATE_BRICK_SLAB, slabDrops(VRBlocks.CRACKED_SLATE_BRICK_SLAB));
        addDrop(VRBlocks.CRACKED_SLATE_BRICK_WALL);

//        addDrop(VRBlocks.NEURON_SYNAPSE, leavesDrops(VRBlocks.NEURON_SYNAPSE, VRBlocks.AXON_SPROUT, 0.0625f));
        leavesDrops(VRBlocks.NEURON_SYNAPSE, VRBlocks.AXON_SPROUT, 0,0625f);


        //addDrop(VRBlocks.BlockName, oreDrops(BlockName, ItemName));
    }
}
