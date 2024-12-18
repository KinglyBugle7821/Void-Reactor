package net.projectk.voidreactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.projectk.voidreactor.VoidReactor;
import net.projectk.voidreactor.block.VRBlocks;

import java.util.concurrent.CompletableFuture;

public class VRRecipeProvider extends FabricRecipeProvider {
    public VRRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, VRBlocks.NEURON_PLANKS, 4)
                .input(VRBlocks.NEURON_AXON)
                .criterion(hasItem(VRBlocks.NEURON_AXON), conditionsFromItem(VRBlocks.NEURON_AXON))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_planks_from_neuron_axon"));
    }
}
