package net.projectk.voidreactor.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.projectk.voidreactor.VoidReactor;
import net.projectk.voidreactor.block.custom.NeuronSynapseBlock;
import net.projectk.voidreactor.block.custom.VRSaplingBlock;
import net.projectk.voidreactor.block.custom.VRStackableBlocks;
import net.projectk.voidreactor.world.tree.VRSaplingGenerators;

import java.util.List;

public class VRBlocks {
    public static final Block NEURON_AXON = registerBlock("neuron_axon",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.neuron_axon"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }
                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block NEURON_MYELIN = registerBlock("neuron_myelin",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.neuron_myelin"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block STRIPPED_NEURON_AXON = registerBlock("stripped_neuron_axon",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.stripped_neuron_axon"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block STRIPPED_NEURON_MYELIN = registerBlock("stripped_neuron_myelin",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.stripped_neuron_myelin"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block NEURON_PLANKS = registerBlock("neuron_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.neuron_planks"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block NEURON_SYNAPSE = registerBlock("neuron_synapse",
            new NeuronSynapseBlock(AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK).nonOpaque()){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.neuron_synapse"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block AXON_SPROUT = registerBlock("axon_sprout",
            new VRSaplingBlock(VRSaplingGenerators.NEURON, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING), VRBlocks.CELESTIAL_GRASS_BLOCK){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.axon_sprout"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });

    public static final Block NEURON_STAIRS = registerBlock("neuron_stairs",
            new StairsBlock(VRBlocks.NEURON_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRIMSON_STAIRS)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.neuron_stairs"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block NEURON_SLAB = registerBlock("neuron_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_SLAB)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.neuron_slab"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block NEURON_BUTTON = registerBlock("neuron_button",
            new ButtonBlock(BlockSetType.OAK, 15, AbstractBlock.Settings.copy(Blocks.CRIMSON_BUTTON)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.neuron_button"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block NEURON_PRESSURE_PLATE = registerBlock("neuron_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.CRIMSON_PRESSURE_PLATE)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.neuron_pressure_plate"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block NEURON_FENCE = registerBlock("neuron_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_FENCE)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.neuron_fence"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block NEURON_FENCE_GATE = registerBlock("neuron_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.CRIMSON_FENCE_GATE)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.neuron_fence_gate"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block NEURON_DOOR = registerBlock("neuron_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.CRIMSON_DOOR)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.neuron_door"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block NEURON_TRAPDOOR = registerBlock("neuron_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.CRIMSON_TRAPDOOR)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.neuron_trapdoor"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });

    public static final Block CELESTIAL_GRASS_BLOCK = registerBlock("celestial_grass_block",
            new GrassBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK).mapColor(MapColor.BLUE)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.celestial_grass_block"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block CELESTIAL_GRASS = registerBlock("celestial_grass",
            new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.celestial_grass"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });
    public static final Block CELESTIAL_DECAY = registerBlock("celestial_decay",
            new VRStackableBlocks(AbstractBlock.Settings.copy(Blocks.PINK_PETALS)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    if(Screen.hasShiftDown()){
                        tooltip.add(Text.translatable("tooltip.void_reactor.celestial_decay"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
                    }

                    super.appendTooltip(stack, context, tooltip, options);
                }
            });

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
