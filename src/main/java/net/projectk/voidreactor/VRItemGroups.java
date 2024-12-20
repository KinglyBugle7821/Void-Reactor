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
                        entries.add(VRBlocks.CELESTIAL_DIRT);
                        entries.add(VRBlocks.CELESTIAL_DECAY);
                        entries.add(VRBlocks.CELESTIAL_VINES);

                        entries.add(VRBlocks.CELESTIAL_STONE);
                        entries.add(VRBlocks.CELESTIAL_COBBLESTONE);

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
