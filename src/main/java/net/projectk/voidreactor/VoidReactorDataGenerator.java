package net.projectk.voidreactor;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.projectk.voidreactor.datagen.*;
import net.projectk.voidreactor.world.VRConfiguredFeatures;
import net.projectk.voidreactor.world.VRPlacedFeatures;

public class VoidReactorDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(VRBlockTagProvider::new);
		pack.addProvider(VRItemTagProvider::new);
		pack.addProvider(VRLootTableProvider::new);
		pack.addProvider(VRModelProvider::new);
		pack.addProvider(VRRecipeProvider::new);
		pack.addProvider(VRRegistryDataGenerator::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, VRConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, VRPlacedFeatures::bootstrap);
	}
}
