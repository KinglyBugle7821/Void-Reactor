package net.projectk.voidreactor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.projectk.voidreactor.VoidReactor;
import net.projectk.voidreactor.block.VRBlocks;
import net.projectk.voidreactor.item.VRItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class VRRecipeProvider extends FabricRecipeProvider {
    public VRRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        List<ItemConvertible> CELESTIAL_COBBLESTONE = List.of(VRBlocks.CELESTIAL_COBBLESTONE);
        List<ItemConvertible> DARKFIRE_ORE = List.of(VRBlocks.DARKFIRE_ORE);
        List<ItemConvertible> GENERO_ORE = List.of(VRBlocks.GENERO_ORE);
        List<ItemConvertible> RAW_CYMIN = List.of(VRItems.RAW_CYMIN, VRBlocks.CYMIN_ORE);
        List<ItemConvertible> CELESTIAL_STONE = List.of(VRBlocks.CELESTIAL_STONE);
        List<ItemConvertible> CELESTIAL_STONE_BRICKS = List.of(VRBlocks.CELESTIAL_STONE_BRICKS);
        List<ItemConvertible> COBBLED_SLATE = List.of(VRBlocks.COBBLED_SLATE);
        List<ItemConvertible> SLATE = List.of(VRBlocks.SLATE);
        List<ItemConvertible> SLATE_TILE = List.of(VRBlocks.SLATE_TILE);
        List<ItemConvertible> POLISHED_SLATE = List.of(VRBlocks.POLISHED_SLATE);
        List<ItemConvertible> SLATE_BRICKS = List.of(VRBlocks.SLATE_BRICKS);

        offerSmelting(exporter, RAW_CYMIN, RecipeCategory.MISC, VRItems.CYMIN_INGOT,
                0.05f, 200, "cymin_ingot");
        offerSmelting(exporter, DARKFIRE_ORE, RecipeCategory.MISC, VRItems.GENERO_PLASMA,
                0.05f, 200, "genero_plasma");
        offerSmelting(exporter, GENERO_ORE, RecipeCategory.MISC, VRItems.DARKFIRE_ESSENCE,
                0.05f, 200, "darkfire_ingot");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_PLANKS, 4)
                .input(VRBlocks.NEURON_AXON)
                .criterion(hasItem(VRBlocks.NEURON_AXON), conditionsFromItem(VRBlocks.NEURON_AXON))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_planks_from_neuron_axon"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_PLANKS, 4)
                .input(VRBlocks.NEURON_MYELIN)
                .criterion(hasItem(VRBlocks.NEURON_MYELIN), conditionsFromItem(VRBlocks.NEURON_MYELIN))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_planks_from_neuron_myelin"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_PLANKS, 4)
                .input(VRBlocks.STRIPPED_NEURON_AXON)
                .criterion(hasItem(VRBlocks.STRIPPED_NEURON_AXON), conditionsFromItem(VRBlocks.STRIPPED_NEURON_AXON))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_planks_from_stripped_neuron_axon"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_PLANKS, 4)
                .input(VRBlocks.STRIPPED_NEURON_MYELIN)
                .criterion(hasItem(VRBlocks.STRIPPED_NEURON_MYELIN), conditionsFromItem(VRBlocks.STRIPPED_NEURON_MYELIN))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_planks_from_stripped_neuron_myelin"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_MYELIN, 3)
                .pattern("##")
                .pattern("##")
                .input('#', VRBlocks.NEURON_AXON)
                .criterion(hasItem(VRBlocks.NEURON_AXON), conditionsFromItem(VRBlocks.NEURON_AXON))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_myelin_from_neuron_axon"));

        createStairsRecipe(VRBlocks.NEURON_STAIRS, Ingredient.ofItems(VRBlocks.NEURON_PLANKS))
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_stairs_from_neuron_planks"));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_SLAB, Ingredient.ofItems(VRBlocks.NEURON_PLANKS))
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_slab_from_neuron_planks"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_BUTTON, 1)
                .input(VRBlocks.NEURON_PLANKS)
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_button_from_neuron_axon"));
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.NEURON_PRESSURE_PLATE, Ingredient.ofItems(VRBlocks.NEURON_PLANKS))
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_pressure_plate_from_neuron_planks"));
        createFenceRecipe(VRBlocks.NEURON_FENCE, Ingredient.ofItems(VRBlocks.NEURON_PLANKS))
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_fence_from_neuron_planks"));
        createFenceGateRecipe(VRBlocks.NEURON_FENCE_GATE, Ingredient.ofItems(VRBlocks.NEURON_PLANKS))
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_fence_gate_from_neuron_planks"));
        createDoorRecipe(VRBlocks.NEURON_DOOR, Ingredient.ofItems(VRBlocks.NEURON_PLANKS))
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_door_from_neuron_planks"));
        createTrapdoorRecipe(VRBlocks.NEURON_TRAPDOOR, Ingredient.ofItems(VRBlocks.NEURON_PLANKS))
                .criterion(hasItem(VRBlocks.NEURON_PLANKS), conditionsFromItem(VRBlocks.NEURON_PLANKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "neuron_trapdoor_from_neuron_planks"));

        offerSmelting(exporter, CELESTIAL_STONE, RecipeCategory.BUILDING_BLOCKS, VRBlocks.SMOOTH_CELESTIAL_STONE,
                0.05f, 200, "celestial_stone");
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SMOOTH_CELESTIAL_STONE_SLAB, Ingredient.ofItems(VRBlocks.SMOOTH_CELESTIAL_STONE))
                .criterion(hasItem(VRBlocks.SMOOTH_CELESTIAL_STONE), conditionsFromItem(VRBlocks.SMOOTH_CELESTIAL_STONE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "smooth_celestial_stone_slab_from_smooth_celestial_stone"));
        offerSmelting(exporter, CELESTIAL_COBBLESTONE, RecipeCategory.BUILDING_BLOCKS, VRBlocks.CELESTIAL_STONE,
                0.05f, 200, "celestial_stone");
        createStairsRecipe(VRBlocks.CELESTIAL_STONE_STAIRS, Ingredient.ofItems(VRBlocks.CELESTIAL_STONE))
                .criterion(hasItem(VRBlocks.CELESTIAL_STONE), conditionsFromItem(VRBlocks.CELESTIAL_STONE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "celestial_stone_stairs_from_celestial_stone"));

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CELESTIAL_STONE_SLAB, Ingredient.ofItems(VRBlocks.CELESTIAL_STONE))
                .criterion(hasItem(VRBlocks.CELESTIAL_STONE), conditionsFromItem(VRBlocks.CELESTIAL_STONE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "celestial_stone_slab_from_celestial_stone"));
        createStairsRecipe(VRBlocks.CELESTIAL_COBBLESTONE_STAIRS, Ingredient.ofItems(VRBlocks.CELESTIAL_COBBLESTONE))
                .criterion(hasItem(VRBlocks.CELESTIAL_COBBLESTONE), conditionsFromItem(VRBlocks.CELESTIAL_COBBLESTONE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "celestial_cobblestone_stairs_from_celestial_cobblestone"));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CELESTIAL_COBBLESTONE_SLAB, Ingredient.ofItems(VRBlocks.CELESTIAL_COBBLESTONE))
                .criterion(hasItem(VRBlocks.CELESTIAL_COBBLESTONE), conditionsFromItem(VRBlocks.CELESTIAL_COBBLESTONE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "celestial_cobblestone_slab_from_celestial_cobblestone"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CELESTIAL_COBBLESTONE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', VRBlocks.CELESTIAL_COBBLESTONE)
                .criterion(hasItem(VRBlocks.CELESTIAL_COBBLESTONE), conditionsFromItem(VRBlocks.CELESTIAL_COBBLESTONE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "celestial_cobblestone_wall_from_celestial_cobblestone"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CELESTIAL_STONE_BRICKS, 4)
                .pattern("##")
                .pattern("##")
                .input('#', VRBlocks.CELESTIAL_STONE)
                .criterion(hasItem(VRBlocks.CELESTIAL_STONE), conditionsFromItem(VRBlocks.CELESTIAL_STONE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "celestial_stone_bricks_from_celestial_stone"));
        createStairsRecipe(VRBlocks.CELESTIAL_STONE_BRICK_STAIRS, Ingredient.ofItems(VRBlocks.CELESTIAL_STONE_BRICKS))
                .criterion(hasItem(VRBlocks.CELESTIAL_STONE_BRICKS), conditionsFromItem(VRBlocks.CELESTIAL_STONE_BRICKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "celestial_stone_brick_stairs_from_celestial_stone_bricks"));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CELESTIAL_STONE_BRICK_SLAB, Ingredient.ofItems(VRBlocks.CELESTIAL_STONE_BRICKS))
                .criterion(hasItem(VRBlocks.CELESTIAL_STONE_BRICKS), conditionsFromItem(VRBlocks.CELESTIAL_STONE_BRICKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "celestial_stone_brick_slab_from_celestial_stone_bricks"));
        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CHISELED_CELESTIAL_STONE_BRICKS, Ingredient.ofItems(VRBlocks.CELESTIAL_STONE_BRICK_SLAB))
                .criterion(hasItem(VRBlocks.CELESTIAL_STONE_BRICK_SLAB), conditionsFromItem(VRBlocks.CELESTIAL_STONE_BRICK_SLAB))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "chiseled_celestial_stone_brick_from_celestial_stone_brick_slab"));
        offerSmelting(exporter, CELESTIAL_STONE_BRICKS, RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_CELESTIAL_STONE_BRICKS,
                0.05f, 200, "celestial_stone");

        offerSmelting(exporter, COBBLED_SLATE, RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE,
                0.05f, 200, "slate");
        createStairsRecipe(VRBlocks.SLATE_STAIRS, Ingredient.ofItems(VRBlocks.SLATE))
                .criterion(hasItem(VRBlocks.SLATE), conditionsFromItem(VRBlocks.SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_stairs_from_slate"));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE_SLAB, Ingredient.ofItems(VRBlocks.SLATE))
                .criterion(hasItem(VRBlocks.SLATE), conditionsFromItem(VRBlocks.SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_slab_from_slate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', VRBlocks.SLATE)
                .criterion(hasItem(VRBlocks.SLATE), conditionsFromItem(VRBlocks.SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_wall_from_slate"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE_BUTTON, 1)
                .input(VRBlocks.SLATE)
                .criterion(hasItem(VRBlocks.SLATE), conditionsFromItem(VRBlocks.SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_button_from_slate"));
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE_PRESSURE_PLATE, Ingredient.ofItems(VRBlocks.SLATE))
                .criterion(hasItem(VRBlocks.SLATE), conditionsFromItem(VRBlocks.SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_pressure_plate_from_slate"));

        offerSmelting(exporter, SLATE, RecipeCategory.BUILDING_BLOCKS, VRBlocks.SMOOTH_SLATE,
                0.05f, 200, "slate");
        createStairsRecipe(VRBlocks.SMOOTH_SLATE_STAIRS, Ingredient.ofItems(VRBlocks.SMOOTH_SLATE))
                .criterion(hasItem(VRBlocks.SMOOTH_SLATE), conditionsFromItem(VRBlocks.SMOOTH_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "smooth_slate_stairs_from_smooth_slate"));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SMOOTH_SLATE_SLAB, Ingredient.ofItems(VRBlocks.SMOOTH_SLATE))
                .criterion(hasItem(VRBlocks.SMOOTH_SLATE), conditionsFromItem(VRBlocks.SMOOTH_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "smooth_slate_slab_from_smooth_slate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SMOOTH_SLATE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', VRBlocks.SMOOTH_SLATE)
                .criterion(hasItem(VRBlocks.SMOOTH_SLATE), conditionsFromItem(VRBlocks.SMOOTH_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "smooth_slate_wall_from_smooth_slate"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SMOOTH_SLATE_BUTTON, 1)
                .input(VRBlocks.SMOOTH_SLATE)
                .criterion(hasItem(VRBlocks.SMOOTH_SLATE), conditionsFromItem(VRBlocks.SMOOTH_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "smooth_slate_button_from_smooth_slate"));
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SMOOTH_SLATE_PRESSURE_PLATE, Ingredient.ofItems(VRBlocks.SMOOTH_SLATE))
                .criterion(hasItem(VRBlocks.SMOOTH_SLATE), conditionsFromItem(VRBlocks.SMOOTH_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "smooth_slate_pressure_plate_from_smooth_slate"));

        createStairsRecipe(VRBlocks.COBBLED_SLATE_STAIRS, Ingredient.ofItems(VRBlocks.COBBLED_SLATE))
                .criterion(hasItem(VRBlocks.COBBLED_SLATE), conditionsFromItem(VRBlocks.COBBLED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cobbled_slate_stairs_from_cobbled_slate"));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.COBBLED_SLATE_SLAB, Ingredient.ofItems(VRBlocks.COBBLED_SLATE))
                .criterion(hasItem(VRBlocks.COBBLED_SLATE), conditionsFromItem(VRBlocks.COBBLED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cobbled_slate_slab_from_cobbled_slate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.COBBLED_SLATE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', VRBlocks.COBBLED_SLATE)
                .criterion(hasItem(VRBlocks.COBBLED_SLATE), conditionsFromItem(VRBlocks.COBBLED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cobbled_slate_wall_from_cobbled_slate"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.COBBLED_SLATE_BUTTON, 1)
                .input(VRBlocks.COBBLED_SLATE)
                .criterion(hasItem(VRBlocks.COBBLED_SLATE_BUTTON), conditionsFromItem(VRBlocks.COBBLED_SLATE_BUTTON))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cobbled_slate_button_from_cobbled_slate"));
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.COBBLED_SLATE_PRESSURE_PLATE, Ingredient.ofItems(VRBlocks.COBBLED_SLATE))
                .criterion(hasItem(VRBlocks.COBBLED_SLATE), conditionsFromItem(VRBlocks.COBBLED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cobbled_slate_pressure_plate_from_cobbled_slate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE_TILE, 4)
                .pattern("##")
                .pattern("##")
                .input('#', VRBlocks.SLATE_BRICKS)
                .criterion(hasItem(VRBlocks.SLATE_BRICKS), conditionsFromItem(VRBlocks.SLATE_BRICKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_tile_from_slate_bricks"));
        createStairsRecipe(VRBlocks.SLATE_TILE_STAIRS, Ingredient.ofItems(VRBlocks.SLATE_TILE))
                .criterion(hasItem(VRBlocks.SLATE_TILE), conditionsFromItem(VRBlocks.SLATE_TILE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_tile_stairs_from_slate_tile"));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS ,VRBlocks.SLATE_TILE_SLAB, Ingredient.ofItems(VRBlocks.SLATE_TILE))
                .criterion(hasItem(VRBlocks.SLATE_TILE), conditionsFromItem(VRBlocks.SLATE_TILE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_tile_slab_from_slate_tile"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE_TILE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', VRBlocks.SLATE_TILE)
                .criterion(hasItem(VRBlocks.SLATE_TILE), conditionsFromItem(VRBlocks.SLATE_TILE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_tile_wall_from_slate_tile"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE_TILE_BUTTON, 1)
                .input(VRBlocks.SLATE_TILE)
                .criterion(hasItem(VRBlocks.SLATE_TILE), conditionsFromItem(VRBlocks.SLATE_TILE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_tile_button_from_slate_tile"));
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE_TILE_PRESSURE_PLATE, Ingredient.ofItems(VRBlocks.SLATE_TILE))
                .criterion(hasItem(VRBlocks.SLATE_TILE), conditionsFromItem(VRBlocks.SLATE_TILE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_tile_pressure_plate_from_slate_tile"));
        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CHISELED_SLATE_TILE, Ingredient.ofItems(VRBlocks.SLATE_TILE_SLAB))
                .criterion(hasItem(VRBlocks.SLATE_TILE_SLAB), conditionsFromItem(VRBlocks.SLATE_TILE_SLAB))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "chiseled_slate_tile_from_slate_tile_slab"));
        offerSmelting(exporter, SLATE_TILE, RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_SLATE_TILE,
                0.05f, 200, "slate");
        createStairsRecipe(VRBlocks.CRACKED_SLATE_TILE_STAIRS, Ingredient.ofItems(VRBlocks.CRACKED_SLATE_TILE))
                .criterion(hasItem(VRBlocks.CRACKED_SLATE_TILE), conditionsFromItem(VRBlocks.CRACKED_SLATE_TILE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_slate_tile_stairs_from_cracked_slate_tile"));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_SLATE_TILE_SLAB, Ingredient.ofItems(VRBlocks.CRACKED_SLATE_TILE))
                .criterion(hasItem(VRBlocks.CRACKED_SLATE_TILE), conditionsFromItem(VRBlocks.CRACKED_SLATE_TILE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_slate_tile_slab_from_cracked_slate_tile"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_SLATE_TILE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', VRBlocks.CRACKED_SLATE_TILE)
                .criterion(hasItem(VRBlocks.CRACKED_SLATE_TILE), conditionsFromItem(VRBlocks.CRACKED_SLATE_TILE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_slate_tile_wall_from_cracked_slate_tile"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_SLATE_TILE_BUTTON, 1)
                .input(VRBlocks.CRACKED_SLATE_TILE)
                .criterion(hasItem(VRBlocks.CRACKED_SLATE_TILE), conditionsFromItem(VRBlocks.CRACKED_SLATE_TILE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_slate_tile_button_from_cracked_slate_tile"));
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_SLATE_TILE_PRESSURE_PLATE, Ingredient.ofItems(VRBlocks.CRACKED_SLATE_TILE))
                .criterion(hasItem(VRBlocks.CRACKED_SLATE_TILE), conditionsFromItem(VRBlocks.CRACKED_SLATE_TILE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_slate_tile_pressure_plate_from_cracked_slate_tile"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.POLISHED_SLATE, 4)
                .pattern("##")
                .pattern("##")
                .input('#', VRBlocks.COBBLED_SLATE)
                .criterion(hasItem(VRBlocks.COBBLED_SLATE), conditionsFromItem(VRBlocks.COBBLED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "polished_slate_from_cobbled_slate"));
        createStairsRecipe(VRBlocks.POLISHED_SLATE_STAIRS, Ingredient.ofItems(VRBlocks.POLISHED_SLATE))
                .criterion(hasItem(VRBlocks.POLISHED_SLATE), conditionsFromItem(VRBlocks.POLISHED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "polished_slate_stairs_from_polished_slate"));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.POLISHED_SLATE_SLAB, Ingredient.ofItems(VRBlocks.POLISHED_SLATE))
                .criterion(hasItem(VRBlocks.POLISHED_SLATE), conditionsFromItem(VRBlocks.POLISHED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "polished_slate_slab_from_polished_slate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.POLISHED_SLATE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', VRBlocks.POLISHED_SLATE)
                .criterion(hasItem(VRBlocks.POLISHED_SLATE), conditionsFromItem(VRBlocks.POLISHED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "polished_slate_wall_from_polished_slate"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.POLISHED_SLATE_BUTTON, 1)
                .input(VRBlocks.POLISHED_SLATE)
                .criterion(hasItem(VRBlocks.POLISHED_SLATE), conditionsFromItem(VRBlocks.POLISHED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "polished_slate_button_from_polished_slate"));
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.POLISHED_SLATE_PRESSURE_PLATE, Ingredient.ofItems(VRBlocks.POLISHED_SLATE))
                .criterion(hasItem(VRBlocks.POLISHED_SLATE), conditionsFromItem(VRBlocks.POLISHED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "polished_slate_pressure_plate_from_polished_slate"));
        createChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CHISELED_POLISHED_SLATE, Ingredient.ofItems(VRBlocks.POLISHED_SLATE_SLAB))
                .criterion(hasItem(VRBlocks.POLISHED_SLATE_SLAB), conditionsFromItem(VRBlocks.POLISHED_SLATE_SLAB))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "chiseled_polished_slate_from_polished_slate_slab"));
        offerSmelting(exporter, POLISHED_SLATE, RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_POLISHED_SLATE,
                0.05f, 200, "slate");
        createStairsRecipe(VRBlocks.CRACKED_POLISHED_SLATE_STAIRS, Ingredient.ofItems(VRBlocks.CRACKED_POLISHED_SLATE))
                .criterion(hasItem(VRBlocks.CRACKED_POLISHED_SLATE), conditionsFromItem(VRBlocks.CRACKED_POLISHED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_polished_slate_stairs_from_cracked_polished_slate"));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_POLISHED_SLATE_SLAB, Ingredient.ofItems(VRBlocks.CRACKED_POLISHED_SLATE))
                .criterion(hasItem(VRBlocks.CRACKED_POLISHED_SLATE), conditionsFromItem(VRBlocks.CRACKED_POLISHED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_polished_slate_slab_from_cracked_polished_slate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_POLISHED_SLATE_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', VRBlocks.CRACKED_POLISHED_SLATE)
                .criterion(hasItem(VRBlocks.CRACKED_POLISHED_SLATE), conditionsFromItem(VRBlocks.CRACKED_POLISHED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_polished_slate_wall_from_cracked_polished_slate"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_POLISHED_SLATE_BUTTON, 1)
                .input(VRBlocks.CRACKED_POLISHED_SLATE)
                .criterion(hasItem(VRBlocks.CRACKED_POLISHED_SLATE), conditionsFromItem(VRBlocks.CRACKED_POLISHED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_polished_slate_button_from_cracked_polished_slate"));
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_POLISHED_SLATE_PRESSURE_PLATE, Ingredient.ofItems(VRBlocks.CRACKED_POLISHED_SLATE))
                .criterion(hasItem(VRBlocks.CRACKED_POLISHED_SLATE), conditionsFromItem(VRBlocks.CRACKED_POLISHED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_polished_slate_pressure_plate_from_cracked_polished_slate"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE_BRICKS, 4)
                .pattern("##")
                .pattern("##")
                .input('#', VRBlocks.POLISHED_SLATE)
                .criterion(hasItem(VRBlocks.POLISHED_SLATE), conditionsFromItem(VRBlocks.POLISHED_SLATE))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_bricks_from_polished_slate"));
        createStairsRecipe(VRBlocks.SLATE_BRICK_STAIRS, Ingredient.ofItems(VRBlocks.SLATE_BRICKS))
                .criterion(hasItem(VRBlocks.SLATE_BRICKS), conditionsFromItem(VRBlocks.SLATE_BRICKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_brick_stairs_from_slate_bricks"));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE_BRICK_SLAB, Ingredient.ofItems(VRBlocks.SLATE_BRICKS))
                .criterion(hasItem(VRBlocks.SLATE_BRICKS), conditionsFromItem(VRBlocks.SLATE_BRICKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_brick_slab_from_slate_bricks"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE_BRICK_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', VRBlocks.SLATE_BRICKS)
                .criterion(hasItem(VRBlocks.SLATE_BRICKS), conditionsFromItem(VRBlocks.SLATE_BRICKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_brick_wall_from_slate_bricks"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE_BRICK_BUTTON, 1)
                .input(VRBlocks.SLATE_BRICKS)
                .criterion(hasItem(VRBlocks.SLATE_BRICKS), conditionsFromItem(VRBlocks.SLATE_BRICKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_brick_button_from_slate_bricks"));
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.SLATE_BRICK_PRESSURE_PLATE, Ingredient.ofItems(VRBlocks.SLATE_BRICKS))
                .criterion(hasItem(VRBlocks.SLATE_BRICKS), conditionsFromItem(VRBlocks.SLATE_BRICKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "slate_brick_pressure_plate_from_slate_bricks"));
        offerSmelting(exporter, SLATE_BRICKS, RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_SLATE_BRICKS,
                0.05f, 200, "slate");
        createStairsRecipe(VRBlocks.CRACKED_SLATE_BRICK_STAIRS, Ingredient.ofItems(VRBlocks.CRACKED_SLATE_BRICKS))
                .criterion(hasItem(VRBlocks.CRACKED_SLATE_BRICKS), conditionsFromItem(VRBlocks.CRACKED_SLATE_BRICKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_slate_brick_stairs_from_cracked_slate_bricks"));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_SLATE_BRICK_SLAB, Ingredient.ofItems(VRBlocks.CRACKED_SLATE_BRICKS))
                .criterion(hasItem(VRBlocks.CRACKED_SLATE_BRICKS), conditionsFromItem(VRBlocks.CRACKED_SLATE_BRICKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_slate_brick_slab_from_cracked_slate_bricks"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_SLATE_BRICK_WALL, 6)
                .pattern("###")
                .pattern("###")
                .input('#', VRBlocks.CRACKED_SLATE_BRICKS)
                .criterion(hasItem(VRBlocks.CRACKED_SLATE_BRICKS), conditionsFromItem(VRBlocks.CRACKED_SLATE_BRICKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_slate_brick_wall_from_cracked_slate_bricks"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_SLATE_BRICK_BUTTON, 1)
                .input(VRBlocks.CRACKED_SLATE_BRICKS)
                .criterion(hasItem(VRBlocks.CRACKED_SLATE_BRICKS), conditionsFromItem(VRBlocks.CRACKED_SLATE_BRICKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_slate_brick_button_from_cracked_slate_bricks"));
        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS, VRBlocks.CRACKED_SLATE_BRICK_PRESSURE_PLATE, Ingredient.ofItems(VRBlocks.CRACKED_SLATE_BRICKS))
                .criterion(hasItem(VRBlocks.CRACKED_SLATE_BRICKS), conditionsFromItem(VRBlocks.CRACKED_SLATE_BRICKS))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cracked_slate_brick_pressure_plate_from_cracked_slate_bricks"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, VRItems.CYMIN_NUGGET, 9)
                .input(VRItems.CYMIN_INGOT)
                .criterion(hasItem(VRItems.CYMIN_INGOT), conditionsFromItem(VRItems.CYMIN_INGOT))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cymin_nugget_from_cymin_ingot"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, VRItems.CYMIN_INGOT, 1)
                .input(VRItems.CYMIN_NUGGET, 9)
                .criterion(hasItem(VRItems.CYMIN_NUGGET), conditionsFromItem(VRItems.CYMIN_NUGGET))
                .offerTo(exporter, Identifier.of(VoidReactor.MOD_ID, "cymin_ingot_from_cymin_nugget"));
    }
}