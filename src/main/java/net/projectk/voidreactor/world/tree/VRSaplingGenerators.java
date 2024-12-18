package net.projectk.voidreactor.world.tree;

import net.minecraft.block.SaplingGenerator;
import net.projectk.voidreactor.VoidReactor;
import net.projectk.voidreactor.world.VRConfiguredFeatures;

import java.util.Optional;

public class VRSaplingGenerators{
    public static final SaplingGenerator NEURON = new SaplingGenerator(VoidReactor.MOD_ID + ":neuron",
            Optional.empty(), Optional.of(VRConfiguredFeatures.NEURON_KEY), Optional.empty());
}
