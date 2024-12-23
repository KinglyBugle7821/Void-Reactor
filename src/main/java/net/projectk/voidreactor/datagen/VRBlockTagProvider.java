package net.projectk.voidreactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(VRBlocks.SMOOTH_CELESTIAL_STONE_SLAB)
                .add(VRBlocks.SMOOTH_CELESTIAL_STONE)
                .add(VRBlocks.CELESTIAL_STONE_STAIRS)
                .add(VRBlocks.CELESTIAL_STONE_SLAB)

                .add(VRBlocks.CELESTIAL_COBBLESTONE)
                .add(VRBlocks.CELESTIAL_COBBLESTONE_STAIRS)
                .add(VRBlocks.CELESTIAL_COBBLESTONE_SLAB)
                .add(VRBlocks.CELESTIAL_COBBLESTONE_WALL)

                .add(VRBlocks.CELESTIAL_STONE_BRICKS)
                .add(VRBlocks.CELESTIAL_STONE_BRICK_STAIRS)
                .add(VRBlocks.CELESTIAL_STONE_BRICK_SLAB)
                .add(VRBlocks.CRACKED_CELESTIAL_STONE_BRICKS)
                .add(VRBlocks.CHISELED_CELESTIAL_STONE_BRICKS)
                .add(VRBlocks.CELESTIAL_STONE_BRICK_WALL)

                .add(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE)
                .add(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE_STAIRS)
                .add(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE_SLAB)
                .add(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE_WALL)

                .add(VRBlocks.MOSSY_CELESTIAL_STONE_BRICKS)
                .add(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_STAIRS)
                .add(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_SLAB)
                .add(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_WALL)

                .add(VRBlocks.DARKFIRE_ORE)
                .add(VRBlocks.GENERO_ORE)
                .add(VRBlocks.GENERO_BLOCK)
                .add(VRBlocks.CYMIN_ORE)
                .add(VRBlocks.CYMIN_BLOCK)

                .add(VRBlocks.REINFORCED_GLASS)
                .add(VRBlocks.RED_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.BLACK_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.BLUE_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.BROWN_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.GREEN_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.WHITE_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.LIME_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.PINK_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.CYAN_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.GRAY_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS)

                .add(VRBlocks.REINFORCED_GLASS_PANE)
                .add(VRBlocks.RED_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.BLACK_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.BLUE_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.BROWN_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.GREEN_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.WHITE_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.LIME_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.PINK_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.CYAN_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.GRAY_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS_PANE)

                .add(VRBlocks.SLATE)
                .add(VRBlocks.SLATE_STAIRS)
                .add(VRBlocks.SLATE_SLAB)
                .add(VRBlocks.SLATE_WALL)

                .add(VRBlocks.SMOOTH_SLATE)
                .add(VRBlocks.SMOOTH_SLATE_STAIRS)
                .add(VRBlocks.SMOOTH_SLATE_SLAB)
                .add(VRBlocks.SMOOTH_SLATE_WALL)

                .add(VRBlocks.COBBLED_SLATE)
                .add(VRBlocks.COBBLED_SLATE_STAIRS)
                .add(VRBlocks.COBBLED_SLATE_SLAB)
                .add(VRBlocks.COBBLED_SLATE_WALL)

                .add(VRBlocks.SLATE_TILE)
                .add(VRBlocks.SLATE_TILE_STAIRS)
                .add(VRBlocks.SLATE_TILE_SLAB)
                .add(VRBlocks.SLATE_TILE_WALL)
                .add(VRBlocks.CHISELED_SLATE_TILE)
                .add(VRBlocks.CRACKED_SLATE_TILE)
                .add(VRBlocks.CRACKED_SLATE_TILE_STAIRS)
                .add(VRBlocks.CRACKED_SLATE_TILE_SLAB)
                .add(VRBlocks.CRACKED_SLATE_TILE_WALL)

                .add(VRBlocks.POLISHED_SLATE)
                .add(VRBlocks.POLISHED_SLATE_STAIRS)
                .add(VRBlocks.POLISHED_SLATE_SLAB)
                .add(VRBlocks.POLISHED_SLATE_WALL)
                .add(VRBlocks.CHISELED_POLISHED_SLATE)
                .add(VRBlocks.CRACKED_POLISHED_SLATE)
                .add(VRBlocks.CRACKED_POLISHED_SLATE_STAIRS)
                .add(VRBlocks.CRACKED_POLISHED_SLATE_SLAB)
                .add(VRBlocks.CRACKED_POLISHED_SLATE_WALL)

                .add(VRBlocks.SLATE_BRICKS)
                .add(VRBlocks.SLATE_BRICK_STAIRS)
                .add(VRBlocks.SLATE_BRICK_SLAB)
                .add(VRBlocks.SLATE_BRICK_WALL)
                .add(VRBlocks.CHISELED_SLATE_BRICKS)
                .add(VRBlocks.CRACKED_SLATE_BRICKS)
                .add(VRBlocks.CRACKED_SLATE_BRICK_STAIRS)
                .add(VRBlocks.CRACKED_SLATE_BRICK_SLAB)
                .add(VRBlocks.CRACKED_SLATE_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(VRBlocks.DARKFIRE_ORE)
                .add(VRBlocks.GENERO_ORE)
                .add(VRBlocks.GENERO_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(VRBlocks.CYMIN_ORE)
                .add(VRBlocks.CYMIN_BLOCK);
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
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(VRBlocks.CELESTIAL_COBBLESTONE_WALL)
                .add(VRBlocks.CELESTIAL_STONE_BRICK_WALL)
                .add(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE_WALL)
                .add(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_WALL)
                .add(VRBlocks.SLATE_WALL)
                .add(VRBlocks.SMOOTH_SLATE_WALL)
                .add(VRBlocks.COBBLED_SLATE_WALL)
                .add(VRBlocks.SLATE_TILE_WALL)
                .add(VRBlocks.CRACKED_SLATE_TILE_WALL)
                .add(VRBlocks.POLISHED_SLATE_WALL)
                .add(VRBlocks.CRACKED_POLISHED_SLATE_WALL)
                .add(VRBlocks.SLATE_BRICK_WALL)
                .add(VRBlocks.CRACKED_SLATE_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(VRBlocks.CELESTIAL_GRASS_BLOCK)
                .add(VRBlocks.CELESTIAL_DIRT);
        getOrCreateTagBuilder(BlockTags.CLIMBABLE).add(VRBlocks.CELESTIAL_VINES);
        getOrCreateTagBuilder(VRTags.Blocks.CELESTIAL_BLOCKS)
                .add(VRBlocks.NEURON_PLANKS)
                .add(VRBlocks.NEURON_AXON)
                .add(VRBlocks.NEURON_MYELIN)
                .add(VRBlocks.STRIPPED_NEURON_AXON)
                .add(VRBlocks.STRIPPED_NEURON_MYELIN)
                .add(VRBlocks.NEURON_SYNAPSE)
                .add(VRBlocks.NEURON_FENCE)
                .add(VRBlocks.NEURON_TRAPDOOR)
                .add(VRBlocks.CELESTIAL_GRASS_BLOCK)
                .add(VRBlocks.CELESTIAL_DIRT)
                .add(VRBlocks.CELESTIAL_STONE)
                .add(VRBlocks.SMOOTH_CELESTIAL_STONE)
                .add(VRBlocks.CELESTIAL_COBBLESTONE)
                .add(VRBlocks.CELESTIAL_STONE_BRICKS)
                .add(VRBlocks.CRACKED_CELESTIAL_STONE_BRICKS)
                .add(VRBlocks.CHISELED_CELESTIAL_STONE_BRICKS)
                .add(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE);
        getOrCreateTagBuilder(BlockTags.STONE_BRICKS)
                .add(VRBlocks.CELESTIAL_STONE_BRICKS)
                .add(VRBlocks.CELESTIAL_STONE_BRICK_STAIRS)
                .add(VRBlocks.CELESTIAL_STONE_BRICK_SLAB)
                .add(VRBlocks.CRACKED_CELESTIAL_STONE_BRICKS)
                .add(VRBlocks.CHISELED_CELESTIAL_STONE_BRICKS)
                .add(VRBlocks.CELESTIAL_STONE_BRICK_WALL)
                .add(VRBlocks.MOSSY_CELESTIAL_STONE_BRICKS)
                .add(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_STAIRS)
                .add(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_SLAB)
                .add(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_WALL);
        getOrCreateTagBuilder(VRTags.Blocks.REINFORCED_GLASS_BLOCKS)
                .add(VRBlocks.REINFORCED_GLASS)
                .add(VRBlocks.RED_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.BLACK_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.BLUE_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.BROWN_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.GREEN_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.WHITE_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.LIME_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.PINK_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.CYAN_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.GRAY_STAINED_REINFORCED_GLASS)
                .add(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS);
        getOrCreateTagBuilder(VRTags.Blocks.REINFORCED_GLASS_BLOCK_PANES)
                .add(VRBlocks.REINFORCED_GLASS_PANE)
                .add(VRBlocks.RED_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.BLACK_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.BLUE_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.BROWN_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.GREEN_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.WHITE_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.LIME_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.PINK_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.CYAN_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.GRAY_STAINED_REINFORCED_GLASS_PANE)
                .add(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS_PANE);
        getOrCreateTagBuilder(VRTags.Blocks.SLATE_BLOCKS)
                .add(VRBlocks.SLATE)
                .add(VRBlocks.SLATE_STAIRS)
                .add(VRBlocks.SLATE_SLAB)
                .add(VRBlocks.SLATE_WALL)

                .add(VRBlocks.SMOOTH_SLATE)
                .add(VRBlocks.SMOOTH_SLATE_STAIRS)
                .add(VRBlocks.SMOOTH_SLATE_SLAB)
                .add(VRBlocks.SMOOTH_SLATE_WALL)

                .add(VRBlocks.COBBLED_SLATE)
                .add(VRBlocks.COBBLED_SLATE_STAIRS)
                .add(VRBlocks.COBBLED_SLATE_SLAB)
                .add(VRBlocks.COBBLED_SLATE_WALL)

                .add(VRBlocks.SLATE_TILE)
                .add(VRBlocks.SLATE_TILE_STAIRS)
                .add(VRBlocks.SLATE_TILE_SLAB)
                .add(VRBlocks.SLATE_TILE_WALL)
                .add(VRBlocks.CHISELED_SLATE_TILE)
                .add(VRBlocks.CRACKED_SLATE_TILE)
                .add(VRBlocks.CRACKED_SLATE_TILE_STAIRS)
                .add(VRBlocks.CRACKED_SLATE_TILE_SLAB)
                .add(VRBlocks.CRACKED_SLATE_TILE_WALL)

                .add(VRBlocks.POLISHED_SLATE)
                .add(VRBlocks.POLISHED_SLATE_STAIRS)
                .add(VRBlocks.POLISHED_SLATE_SLAB)
                .add(VRBlocks.POLISHED_SLATE_WALL)
                .add(VRBlocks.CHISELED_POLISHED_SLATE)
                .add(VRBlocks.CRACKED_POLISHED_SLATE)
                .add(VRBlocks.CRACKED_POLISHED_SLATE_STAIRS)
                .add(VRBlocks.CRACKED_POLISHED_SLATE_SLAB)
                .add(VRBlocks.CRACKED_POLISHED_SLATE_WALL)

                .add(VRBlocks.SLATE_BRICKS)
                .add(VRBlocks.SLATE_BRICK_STAIRS)
                .add(VRBlocks.SLATE_BRICK_SLAB)
                .add(VRBlocks.SLATE_BRICK_WALL)
                .add(VRBlocks.CHISELED_SLATE_BRICKS)
                .add(VRBlocks.CRACKED_SLATE_BRICKS)
                .add(VRBlocks.CRACKED_SLATE_BRICK_STAIRS)
                .add(VRBlocks.CRACKED_SLATE_BRICK_SLAB)
                .add(VRBlocks.CRACKED_SLATE_BRICK_WALL);
    }
}
