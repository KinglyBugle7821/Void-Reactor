package net.projectk.voidreactor.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.projectk.voidreactor.VoidReactor;
import net.projectk.voidreactor.world.tree.VRSaplingGenerators;

public class VRBlocks {
    public static final Block NEURON_AXON = registerBlock("neuron_axon",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM)));
    public static final Block NEURON_MYELIN = registerBlock("neuron_myelin",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));
    public static final Block STRIPPED_NEURON_AXON = registerBlock("stripped_neuron_axon",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));
    public static final Block STRIPPED_NEURON_MYELIN = registerBlock("stripped_neuron_myelin",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));

    public static final Block NEURON_PLANKS = registerBlock("neuron_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block NEURON_SYNAPSE = registerBlock("neuron_synapse",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));

    public static final Block NEURON_STAIRS = registerBlock("neuron_stairs",
            new StairsBlock(VRBlocks.NEURON_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.CRIMSON_STAIRS)));
    public static final Block NEURON_SLAB = registerBlock("neuron_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_SLAB)));

    public static final Block NEURON_BUTTON = registerBlock("neuron_button",
            new ButtonBlock(BlockSetType.OAK, 15,
                    AbstractBlock.Settings.copy(Blocks.CRIMSON_BUTTON)));
    public static final Block NEURON_PRESSURE_PLATE = registerBlock("neuron_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.copy(Blocks.CRIMSON_PRESSURE_PLATE)));

    public static final Block NEURON_FENCE = registerBlock("neuron_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_FENCE)));
    public static final Block NEURON_FENCE_GATE = registerBlock("neuron_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.copy(Blocks.CRIMSON_FENCE_GATE)));

    public static final Block NEURON_DOOR = registerBlock("neuron_door",
            new DoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.copy(Blocks.CRIMSON_DOOR)));
    public static final Block NEURON_TRAPDOOR = registerBlock("neuron_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.copy(Blocks.CRIMSON_TRAPDOOR)));

    public static final Block AXON_SPROUT = registerBlock("axon_sprout",
            new SaplingBlock(VRSaplingGenerators.NEURON, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

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
