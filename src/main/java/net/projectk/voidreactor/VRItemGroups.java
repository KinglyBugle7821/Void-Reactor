package net.projectk.voidreactor;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.projectk.voidreactor.block.VRBlocks;
import net.projectk.voidreactor.item.VRItems;

public class VRItemGroups {
    public static final ItemGroup VOID_REACTOR_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VoidReactor.MOD_ID, "void_reactor_tab"),
            FabricItemGroup.builder().icon(() -> new ItemStack(VRBlocks.NEURON_PLANKS))
                    .displayName(Text.translatable("itemgroup.void_reactor.void_reactor_tab"))
                    .entries((displayContext, entries) -> {
                        entries.add(VRBlocks.NEURON_AXON);
                        entries.add(VRBlocks.NEURON_MYELIN);
                        entries.add(VRBlocks.STRIPPED_NEURON_AXON);
                        entries.add(VRBlocks.STRIPPED_NEURON_MYELIN);

                        entries.add(VRBlocks.NEURON_PLANKS);
                        entries.add(VRBlocks.NEURON_SYNAPSE);
                        entries.add(VRBlocks.AXON_SPROUT);

                        entries.add(VRBlocks.CELESTIAL_GRASS_BLOCK);
                        entries.add(VRBlocks.CELESTIAL_GRASS);
                        entries.add(VRBlocks.CELESTIAL_TALL_GRASS);
                        entries.add(VRBlocks.CELESTIAL_DIRT);
                        entries.add(VRBlocks.CELESTIAL_DECAY);
                        entries.add(VRBlocks.CELESTIAL_VINES);

                        entries.add(VRBlocks.REINFORCED_GLASS);
                        entries.add(VRBlocks.RED_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.BLACK_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.BLUE_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.BROWN_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.GREEN_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.WHITE_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.LIME_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.PINK_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.CYAN_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.GRAY_STAINED_REINFORCED_GLASS);
                        entries.add(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS);

                        entries.add(VRBlocks.REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.RED_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.BLACK_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.BLUE_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.BROWN_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.GREEN_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.WHITE_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.YELLOW_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.LIGHT_BLUE_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.LIGHT_GRAY_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.LIME_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.MAGENTA_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.ORANGE_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.PINK_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.CYAN_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.GRAY_STAINED_REINFORCED_GLASS_PANE);
                        entries.add(VRBlocks.PURPLE_STAINED_REINFORCED_GLASS_PANE);

                        entries.add(VRBlocks.CELESTIAL_STONE);
                        entries.add(VRBlocks.SMOOTH_CELESTIAL_STONE_SLAB);
                        entries.add(VRBlocks.SMOOTH_CELESTIAL_STONE);
                        entries.add(VRBlocks.CELESTIAL_STONE_STAIRS);
                        entries.add(VRBlocks.CELESTIAL_STONE_SLAB);

                        entries.add(VRBlocks.CELESTIAL_COBBLESTONE);
                        entries.add(VRBlocks.CELESTIAL_COBBLESTONE_STAIRS);
                        entries.add(VRBlocks.CELESTIAL_COBBLESTONE_SLAB);
                        entries.add(VRBlocks.CELESTIAL_COBBLESTONE_WALL);

                        entries.add(VRBlocks.CELESTIAL_STONE_BRICKS);
                        entries.add(VRBlocks.CELESTIAL_STONE_BRICK_STAIRS);
                        entries.add(VRBlocks.CELESTIAL_STONE_BRICK_SLAB);
                        entries.add(VRBlocks.CRACKED_CELESTIAL_STONE_BRICKS);
                        entries.add(VRBlocks.CHISELED_CELESTIAL_STONE_BRICKS);
                        entries.add(VRBlocks.CELESTIAL_STONE_BRICK_WALL);

                        entries.add(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE);
                        entries.add(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE_STAIRS);
                        entries.add(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE_SLAB);
                        entries.add(VRBlocks.MOSSY_CELESTIAL_COBBLESTONE_WALL);

                        entries.add(VRBlocks.MOSSY_CELESTIAL_STONE_BRICKS);
                        entries.add(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_STAIRS);
                        entries.add(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_SLAB);
                        entries.add(VRBlocks.MOSSY_CELESTIAL_STONE_BRICK_WALL);

                        entries.add(VRBlocks.DARKFIRE_ORE);
                        entries.add(VRBlocks.GENERO_ORE);
                        entries.add(VRBlocks.CYMIN_ORE);
                        entries.add(VRBlocks.DARKFIRE_BLOCK);
                        entries.add(VRBlocks.GENERO_BLOCK);
                        entries.add(VRBlocks.CYMIN_BLOCK);

                        entries.add(VRBlocks.NEURON_BUTTON);
                        entries.add(VRBlocks.NEURON_DOOR);
                        entries.add(VRBlocks.NEURON_FENCE);
                        entries.add(VRBlocks.NEURON_FENCE_GATE);
                        entries.add(VRBlocks.NEURON_PRESSURE_PLATE);
                        entries.add(VRBlocks.NEURON_SLAB);
                        entries.add(VRBlocks.NEURON_STAIRS);
                        entries.add(VRBlocks.NEURON_TRAPDOOR);

                        entries.add(VRBlocks.SLATE);
                        entries.add(VRBlocks.SLATE_STAIRS);
                        entries.add(VRBlocks.SLATE_SLAB);
                        entries.add(VRBlocks.SLATE_WALL);
                        entries.add(VRBlocks.SLATE_BUTTON);
                        entries.add(VRBlocks.SLATE_PRESSURE_PLATE);

                        entries.add(VRBlocks.SMOOTH_SLATE);
                        entries.add(VRBlocks.SMOOTH_SLATE_STAIRS);
                        entries.add(VRBlocks.SMOOTH_SLATE_SLAB);
                        entries.add(VRBlocks.SMOOTH_SLATE_WALL);
                        entries.add(VRBlocks.SMOOTH_SLATE_BUTTON);
                        entries.add(VRBlocks.SMOOTH_SLATE_PRESSURE_PLATE);

                        entries.add(VRBlocks.COBBLED_SLATE);
                        entries.add(VRBlocks.COBBLED_SLATE_STAIRS);
                        entries.add(VRBlocks.COBBLED_SLATE_SLAB);
                        entries.add(VRBlocks.COBBLED_SLATE_WALL);
                        entries.add(VRBlocks.COBBLED_SLATE_BUTTON);
                        entries.add(VRBlocks.COBBLED_SLATE_PRESSURE_PLATE);

                        entries.add(VRBlocks.SLATE_TILE);
                        entries.add(VRBlocks.SLATE_TILE_STAIRS);
                        entries.add(VRBlocks.SLATE_TILE_SLAB);
                        entries.add(VRBlocks.SLATE_TILE_WALL);
                        entries.add(VRBlocks.SLATE_TILE_BUTTON);
                        entries.add(VRBlocks.SLATE_TILE_PRESSURE_PLATE);
                        entries.add(VRBlocks.CHISELED_SLATE_TILE);
                        entries.add(VRBlocks.CRACKED_SLATE_TILE);
                        entries.add(VRBlocks.CRACKED_SLATE_TILE_STAIRS);
                        entries.add(VRBlocks.CRACKED_SLATE_TILE_SLAB);
                        entries.add(VRBlocks.CRACKED_SLATE_TILE_WALL);
                        entries.add(VRBlocks.CRACKED_SLATE_TILE_BUTTON);
                        entries.add(VRBlocks.CRACKED_SLATE_TILE_PRESSURE_PLATE);

                        entries.add(VRBlocks.POLISHED_SLATE);
                        entries.add(VRBlocks.POLISHED_SLATE_STAIRS);
                        entries.add(VRBlocks.POLISHED_SLATE_SLAB);
                        entries.add(VRBlocks.POLISHED_SLATE_WALL);
                        entries.add(VRBlocks.POLISHED_SLATE_BUTTON);
                        entries.add(VRBlocks.POLISHED_SLATE_PRESSURE_PLATE);
                        entries.add(VRBlocks.CHISELED_POLISHED_SLATE);
                        entries.add(VRBlocks.CRACKED_POLISHED_SLATE);
                        entries.add(VRBlocks.CRACKED_POLISHED_SLATE_STAIRS);
                        entries.add(VRBlocks.CRACKED_POLISHED_SLATE_SLAB);
                        entries.add(VRBlocks.CRACKED_POLISHED_SLATE_WALL);
                        entries.add(VRBlocks.CRACKED_POLISHED_SLATE_BUTTON);
                        entries.add(VRBlocks.CRACKED_POLISHED_SLATE_PRESSURE_PLATE);

                        entries.add(VRBlocks.SLATE_BRICKS);
                        entries.add(VRBlocks.SLATE_BRICK_STAIRS);
                        entries.add(VRBlocks.SLATE_BRICK_SLAB);
                        entries.add(VRBlocks.SLATE_BRICK_WALL);
                        entries.add(VRBlocks.SLATE_BRICK_BUTTON);
                        entries.add(VRBlocks.SLATE_BRICK_PRESSURE_PLATE);
                        entries.add(VRBlocks.CHISELED_SLATE_BRICKS);
                        entries.add(VRBlocks.CRACKED_SLATE_BRICKS);
                        entries.add(VRBlocks.CRACKED_SLATE_BRICK_STAIRS);
                        entries.add(VRBlocks.CRACKED_SLATE_BRICK_SLAB);
                        entries.add(VRBlocks.CRACKED_SLATE_BRICK_WALL);
                        entries.add(VRBlocks.CRACKED_SLATE_BRICK_BUTTON);
                        entries.add(VRBlocks.CRACKED_SLATE_BRICK_PRESSURE_PLATE);

                        entries.add(VRItems.DARKFIRE_ESSENCE);
                        entries.add(VRItems.GENERO_PLASMA);
                        entries.add(VRItems.RAW_CYMIN);
                        entries.add(VRItems.CYMIN_INGOT);
                        entries.add(VRItems.CYMIN_NUGGET);
                    }).build());

    public static void registerItemGroups(){
        VoidReactor.LOGGER.info("Registering Item Groups for " + VoidReactor.MOD_ID);
    }
}
