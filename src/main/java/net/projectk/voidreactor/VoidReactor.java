package net.projectk.voidreactor;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.FireBlock;
import net.projectk.voidreactor.block.VRBlocks;
import net.projectk.voidreactor.particle.VRParticles;
import net.projectk.voidreactor.world.gen.VRWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VoidReactor implements ModInitializer {
	public static final String MOD_ID = "void_reactor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		VRItemGroups.registerItemGroups();
		VRBlocks.registerVRBlocks();
		VRParticles.registerParticles();
		VRWorldGen.generateModWorldGen();

		StrippableBlockRegistry.register(VRBlocks.NEURON_AXON, VRBlocks.STRIPPED_NEURON_AXON);
		StrippableBlockRegistry.register(VRBlocks.NEURON_MYELIN, VRBlocks.STRIPPED_NEURON_MYELIN);

		FlammableBlockRegistry.getDefaultInstance().add(VRBlocks.NEURON_AXON, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(VRBlocks.NEURON_MYELIN, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(VRBlocks.STRIPPED_NEURON_AXON, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(VRBlocks.STRIPPED_NEURON_MYELIN, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(VRBlocks.NEURON_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(VRBlocks.NEURON_SYNAPSE, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(VRBlocks.CELESTIAL_VINES, 30, 60);
	}
}