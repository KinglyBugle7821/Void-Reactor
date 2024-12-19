package net.projectk.voidreactor;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.projectk.voidreactor.block.VRBlocks;

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
                        entries.add(VRBlocks.CELESTIAL_DECAY);

                        entries.add(VRBlocks.NEURON_BUTTON);
                        entries.add(VRBlocks.NEURON_DOOR);
                        entries.add(VRBlocks.NEURON_FENCE);
                        entries.add(VRBlocks.NEURON_FENCE_GATE);
                        entries.add(VRBlocks.NEURON_PRESSURE_PLATE);
                        entries.add(VRBlocks.NEURON_SLAB);
                        entries.add(VRBlocks.NEURON_STAIRS);
                        entries.add(VRBlocks.NEURON_TRAPDOOR);
                    }).build());

    public static void registerItemGroups(){
        VoidReactor.LOGGER.info("Registering Item Groups for " + VoidReactor.MOD_ID);
    }
}
