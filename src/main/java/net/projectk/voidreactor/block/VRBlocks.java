package net.projectk.voidreactor.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.projectk.voidreactor.VoidReactor;
import net.projectk.voidreactor.block.custom.*;
import net.projectk.voidreactor.world.tree.VRSaplingGenerators;

public class VRBlocks {
    public static final Block NEURON_AXON = registerBlock("neuron_axon",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM).mapColor(DyeColor.BROWN)));
    public static final Block NEURON_MYELIN = registerBlock("neuron_myelin",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE).mapColor(DyeColor.BROWN)));
    public static final Block STRIPPED_NEURON_AXON = registerBlock("stripped_neuron_axon",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE).mapColor(DyeColor.BROWN)));
    public static final Block STRIPPED_NEURON_MYELIN = registerBlock("stripped_neuron_myelin",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE).mapColor(DyeColor.BROWN)));
    public static final Block NEURON_PLANKS = registerBlock("neuron_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS).mapColor(DyeColor.BROWN)));
    public static final Block NEURON_SYNAPSE = registerBlock("neuron_synapse",
            new NeuronSynapseBlock(AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK).nonOpaque().mapColor(DyeColor.LIGHT_BLUE)));
    public static final Block AXON_SPROUT = registerBlock("axon_sprout",
            new VRSaplingBlock(VRSaplingGenerators.NEURON, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).mapColor(DyeColor.LIGHT_BLUE), VRBlocks.CELESTIAL_GRASS_BLOCK));

    public static final Block NEURON_STAIRS = registerBlock("neuron_stairs",
            new StairsBlock(VRBlocks.NEURON_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRIMSON_STAIRS).mapColor(DyeColor.BROWN)));
    public static final Block NEURON_SLAB = registerBlock("neuron_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_SLAB).mapColor(DyeColor.BROWN)));
    public static final Block NEURON_BUTTON = registerBlock("neuron_button",
            new ButtonBlock(BlockSetType.OAK, 15, AbstractBlock.Settings.copy(Blocks.CRIMSON_BUTTON).mapColor(DyeColor.BROWN)));
    public static final Block NEURON_PRESSURE_PLATE = registerBlock("neuron_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.CRIMSON_PRESSURE_PLATE).mapColor(DyeColor.BROWN)));
    public static final Block NEURON_FENCE = registerBlock("neuron_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_FENCE).mapColor(DyeColor.BROWN)));
    public static final Block NEURON_FENCE_GATE = registerBlock("neuron_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.CRIMSON_FENCE_GATE).mapColor(DyeColor.BROWN)));
    public static final Block NEURON_DOOR = registerBlock("neuron_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.CRIMSON_DOOR).mapColor(DyeColor.BROWN)));
    public static final Block NEURON_TRAPDOOR = registerBlock("neuron_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.CRIMSON_TRAPDOOR).mapColor(DyeColor.BROWN)));

    public static final Block CELESTIAL_GRASS_BLOCK = registerBlock("celestial_grass_block",
            new CelestialGrassBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.BLUE)));
    public static final Block CELESTIAL_DIRT = registerBlock("celestial_dirt",
            new Block(AbstractBlock.Settings.copy(Blocks.DIRT).mapColor(MapColor.BLUE)));
    public static final Block CELESTIAL_GRASS = registerBlock("celestial_grass",
            new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS).mapColor(MapColor.BLUE)));
    public static final Block CELESTIAL_TALL_GRASS = registerBlock("celestial_tall_grass",
            new TallPlantBlock(AbstractBlock.Settings.copy(Blocks.TALL_GRASS).mapColor(MapColor.BLUE)));
    public static final Block CELESTIAL_DECAY = registerBlock("celestial_decay",
            new VRStackableBlocks(AbstractBlock.Settings.copy(Blocks.PINK_PETALS).mapColor(MapColor.BLACK)));
    public static final Block CELESTIAL_VINES = registerBlock("celestial_vines",
            new VineBlock(AbstractBlock.Settings.copy(Blocks.VINE).mapColor(MapColor.BLUE)));

    public static final Block CELESTIAL_STONE = registerBlock("celestial_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).mapColor(MapColor.DARK_AQUA).mapColor(MapColor.DARK_AQUA)));
    public static final Block SMOOTH_CELESTIAL_STONE_SLAB = registerBlock("smooth_celestial_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_SLAB).mapColor(MapColor.DARK_AQUA)));
    public static final Block SMOOTH_CELESTIAL_STONE = registerBlock("smooth_celestial_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE).mapColor(MapColor.DARK_AQUA)));
    public static final Block CELESTIAL_STONE_STAIRS = registerBlock("celestial_stone_stairs",
            new StairsBlock(VRBlocks.CELESTIAL_STONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_STAIRS)));
    public static final Block CELESTIAL_STONE_SLAB = registerBlock("celestial_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_SLAB).mapColor(MapColor.DARK_AQUA)));

    public static final Block CELESTIAL_COBBLESTONE = registerBlock("celestial_cobblestone",
            new Block(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE).mapColor(MapColor.DARK_AQUA)));
    public static final Block CELESTIAL_COBBLESTONE_STAIRS = registerBlock("celestial_cobblestone_stairs",
            new StairsBlock(VRBlocks.CELESTIAL_COBBLESTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_STAIRS).mapColor(MapColor.DARK_AQUA)));
    public static final Block CELESTIAL_COBBLESTONE_SLAB = registerBlock("celestial_cobblestone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_STAIRS).mapColor(MapColor.DARK_AQUA)));
    public static final Block CELESTIAL_COBBLESTONE_WALL = registerBlock("celestial_cobblestone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_WALL).mapColor(MapColor.DARK_AQUA)));

    public static final Block CELESTIAL_STONE_BRICKS = registerBlock("celestial_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).mapColor(MapColor.DARK_AQUA)));
    public static final Block CELESTIAL_STONE_BRICK_STAIRS = registerBlock("celestial_stone_brick_stairs",
            new StairsBlock(VRBlocks.CELESTIAL_STONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_STAIRS).mapColor(MapColor.DARK_AQUA)));
    public static final Block CELESTIAL_STONE_BRICK_SLAB = registerBlock("celestial_stone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_SLAB).mapColor(MapColor.DARK_AQUA)));
    public static final Block CRACKED_CELESTIAL_STONE_BRICKS = registerBlock("cracked_celestial_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).mapColor(MapColor.DARK_AQUA)));
    public static final Block CHISELED_CELESTIAL_STONE_BRICKS = registerBlock("chiseled_celestial_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE).mapColor(MapColor.DARK_AQUA)));
    public static final Block CELESTIAL_STONE_BRICK_WALL = registerBlock("celestial_stone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_WALL).mapColor(MapColor.DARK_AQUA)));

    public static final Block MOSSY_CELESTIAL_COBBLESTONE = registerBlock("mossy_celestial_cobblestone",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).mapColor(MapColor.DARK_AQUA)));
    public static final Block MOSSY_CELESTIAL_COBBLESTONE_STAIRS = registerBlock("mossy_celestial_cobblestone_stairs",
            new StairsBlock(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_STAIRS).mapColor(MapColor.DARK_AQUA)));
    public static final Block MOSSY_CELESTIAL_COBBLESTONE_SLAB = registerBlock("mossy_celestial_cobblestone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).mapColor(MapColor.DARK_AQUA)));
    public static final Block MOSSY_CELESTIAL_COBBLESTONE_WALL = registerBlock("mossy_celestial_cobblestone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).mapColor(MapColor.DARK_AQUA)));

    public static final Block MOSSY_CELESTIAL_STONE_BRICKS = registerBlock("mossy_celestial_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).mapColor(MapColor.DARK_AQUA)));
    public static final Block MOSSY_CELESTIAL_STONE_BRICK_STAIRS = registerBlock("mossy_celestial_stone_brick_stairs",
            new StairsBlock(VRBlocks.MOSSY_CELESTIAL_STONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_TILE_STAIRS).mapColor(MapColor.DARK_AQUA)));
    public static final Block MOSSY_CELESTIAL_STONE_BRICK_SLAB = registerBlock("mossy_celestial_stone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).mapColor(MapColor.DARK_AQUA)));
    public static final Block MOSSY_CELESTIAL_STONE_BRICK_WALL = registerBlock("mossy_celestial_stone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).mapColor(MapColor.DARK_AQUA)));

    public static final Block DARKFIRE_ORE = registerBlock("darkfire_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE).mapColor(MapColor.GRAY)));
    public static final Block GENERO_ORE = registerBlock("genero_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE).mapColor(MapColor.GRAY)));
    public static final Block CYMIN_ORE = registerBlock("cymin_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE).mapColor(MapColor.GRAY)));

    public static final Block DARKFIRE_BLOCK = registerBlock("darkfire_block",
            new VRFireBlock(AbstractBlock.Settings.copy(Blocks.FIRE).mapColor(MapColor.GRAY).sounds(BlockSoundGroup.TRIAL_SPAWNER)));
    public static final Block GENERO_BLOCK = registerBlock("genero_block",
            new Block(AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK).mapColor(MapColor.BRIGHT_TEAL)));
    public static final Block CYMIN_BLOCK = registerBlock("cymin_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.GRAY)));


    public static final Block REINFORCED_GLASS = registerBlock("reinforced_glass",
            new StainedGlassBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).mapColor(MapColor.WHITE).nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block RED_STAINED_REINFORCED_GLASS = registerBlock("red_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.RED).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_STAINED_REINFORCED_GLASS = registerBlock("black_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.BLACK).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLUE_STAINED_REINFORCED_GLASS = registerBlock("blue_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.BLUE).sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_STAINED_REINFORCED_GLASS = registerBlock("brown_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.BROWN).sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_STAINED_REINFORCED_GLASS = registerBlock("green_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.GREEN).sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_STAINED_REINFORCED_GLASS = registerBlock("white_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.WHITE).sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_STAINED_REINFORCED_GLASS = registerBlock("yellow_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.YELLOW).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_STAINED_REINFORCED_GLASS = registerBlock("light_blue_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.LIGHT_BLUE).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_STAINED_REINFORCED_GLASS = registerBlock("light_gray_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_STAINED_REINFORCED_GLASS = registerBlock("lime_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.LIME).sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_STAINED_REINFORCED_GLASS = registerBlock("magenta_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.MAGENTA).sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_STAINED_REINFORCED_GLASS = registerBlock("orange_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_STAINED_REINFORCED_GLASS = registerBlock("pink_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.PINK).sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_STAINED_REINFORCED_GLASS = registerBlock("cyan_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_STAINED_REINFORCED_GLASS = registerBlock("gray_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.GRAY).sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_STAINED_REINFORCED_GLASS = registerBlock("purple_stained_reinforced_glass",
            new StainedGlassBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.PURPLE).sounds(BlockSoundGroup.GLASS)));

    public static final Block REINFORCED_GLASS_PANE = registerBlock("reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).mapColor(MapColor.WHITE).nonOpaque().sounds(BlockSoundGroup.GLASS)));
    public static final Block RED_STAINED_REINFORCED_GLASS_PANE = registerBlock("red_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.RED).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_STAINED_REINFORCED_GLASS_PANE = registerBlock("black_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.BLACK).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLUE_STAINED_REINFORCED_GLASS_PANE = registerBlock("blue_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.BLUE).sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_STAINED_REINFORCED_GLASS_PANE = registerBlock("brown_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.BROWN).sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_STAINED_REINFORCED_GLASS_PANE = registerBlock("green_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.GREEN).sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_STAINED_REINFORCED_GLASS_PANE = registerBlock("white_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.WHITE).sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_STAINED_REINFORCED_GLASS_PANE = registerBlock("yellow_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.YELLOW).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_STAINED_REINFORCED_GLASS_PANE = registerBlock("light_blue_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.LIGHT_BLUE).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_STAINED_REINFORCED_GLASS_PANE = registerBlock("light_gray_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.LIGHT_GRAY).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_STAINED_REINFORCED_GLASS_PANE = registerBlock("lime_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.LIME).sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_STAINED_REINFORCED_GLASS_PANE = registerBlock("magenta_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.MAGENTA).sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_STAINED_REINFORCED_GLASS_PANE = registerBlock("orange_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_STAINED_REINFORCED_GLASS_PANE = registerBlock("pink_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.PINK).sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_STAINED_REINFORCED_GLASS_PANE = registerBlock("cyan_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.CYAN).sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_STAINED_REINFORCED_GLASS_PANE = registerBlock("gray_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.GRAY).sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_STAINED_REINFORCED_GLASS_PANE = registerBlock("purple_stained_reinforced_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque().mapColor(MapColor.PURPLE).sounds(BlockSoundGroup.GLASS)));

    public static final Block SLATE = registerBlock("slate",
            new Block(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block SLATE_STAIRS = registerBlock("slate_stairs",
            new StairsBlock(VRBlocks.SLATE.getDefaultState() ,AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block SLATE_SLAB = registerBlock("slate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block SLATE_WALL = registerBlock("slate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));

    public static final Block SMOOTH_SLATE = registerBlock("smooth_slate",
            new Block(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block SMOOTH_SLATE_STAIRS = registerBlock("smooth_slate_stairs",
            new StairsBlock(VRBlocks.SMOOTH_SLATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block SMOOTH_SLATE_SLAB = registerBlock("smooth_slate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block SMOOTH_SLATE_WALL = registerBlock("smooth_slate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));

    public static final Block COBBLED_SLATE = registerBlock("cobbled_slate",
            new Block(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block COBBLED_SLATE_STAIRS = registerBlock("cobbled_slate_stairs",
            new StairsBlock(VRBlocks.COBBLED_SLATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block COBBLED_SLATE_SLAB = registerBlock("cobbled_slate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block COBBLED_SLATE_WALL = registerBlock("cobbled_slate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));

    public static final Block SLATE_TILE = registerBlock("slate_tile",
            new Block(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block SLATE_TILE_STAIRS = registerBlock("slate_tile_stairs",
            new StairsBlock(VRBlocks.SLATE_TILE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block SLATE_TILE_SLAB = registerBlock("slate_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block SLATE_TILE_WALL = registerBlock("slate_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CHISELED_SLATE_TILE = registerBlock("chiseled_slate_tile",
            new Block(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CRACKED_SLATE_TILE = registerBlock("cracked_slate_tile",
            new Block(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CRACKED_SLATE_TILE_STAIRS = registerBlock("cracked_slate_tile_stairs",
            new StairsBlock(VRBlocks.CRACKED_SLATE_TILE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CRACKED_SLATE_TILE_SLAB = registerBlock("cracked_slate_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CRACKED_SLATE_TILE_WALL = registerBlock("cracked_slate_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));

    public static final Block POLISHED_SLATE = registerBlock("polished_slate",
            new Block(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block POLISHED_SLATE_STAIRS = registerBlock("polished_slate_stairs",
            new StairsBlock(VRBlocks.POLISHED_SLATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block POLISHED_SLATE_SLAB = registerBlock("polished_slate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block POLISHED_SLATE_WALL = registerBlock("polished_slate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CHISELED_POLISHED_SLATE = registerBlock("chiseled_polished_slate",
            new Block(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CRACKED_POLISHED_SLATE = registerBlock("cracked_polished_slate",
            new Block(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CRACKED_POLISHED_SLATE_STAIRS = registerBlock("cracked_polished_slate_stairs",
            new StairsBlock(VRBlocks.CRACKED_POLISHED_SLATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CRACKED_POLISHED_SLATE_SLAB = registerBlock("cracked_polished_slate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CRACKED_POLISHED_SLATE_WALL = registerBlock("cracked_polished_slate_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));

    public static final Block SLATE_BRICKS = registerBlock("slate_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block SLATE_BRICK_STAIRS = registerBlock("slate_brick_stairs",
            new StairsBlock(VRBlocks.SLATE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block SLATE_BRICK_SLAB = registerBlock("slate_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block SLATE_BRICK_WALL = registerBlock("slate_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CHISELED_SLATE_BRICKS = registerBlock("chiseled_slate_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CRACKED_SLATE_BRICKS = registerBlock("cracked_slate_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CRACKED_SLATE_BRICK_STAIRS = registerBlock("cracked_slate_brick_stairs",
            new StairsBlock(VRBlocks.CRACKED_SLATE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CRACKED_SLATE_BRICK_SLAB = registerBlock("cracked_slate_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
    public static final Block CRACKED_SLATE_BRICK_WALL = registerBlock("cracked_slate_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VoidReactor.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(VoidReactor.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerVRBlocks(){
        VoidReactor.LOGGER.info("Registering VR Blocks for " + VoidReactor.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(VRBlocks.NEURON_PLANKS);
        });
    }
}
