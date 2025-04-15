package net.chookoo.devilsreject2.datagen;

import net.chookoo.devilsreject2.Devilsreject2;
import net.chookoo.devilsreject2.block.ModBlocks;
import net.chookoo.devilsreject2.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.QUESTION_MARK_BLOCK)
                .pattern("QQQ")
                .pattern("QQQ")
                .pattern("QQQ")
                .input('Q', ModItems.QUESTION_MARK)
                .criterion(hasItem(ModItems.QUESTION_MARK), conditionsFromItem(ModItems.QUESTION_MARK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.QUESTION_MARK, 64)
                .pattern("EBC")
                .pattern("DAF")
                .pattern("GIH")
                .input('A', Items.MAGENTA_BANNER)
                .input('B', Items.MOJANG_BANNER_PATTERN)
                .input('C', Items.GLOBE_BANNER_PATTERN)
                .input('D', Items.FLOW_BANNER_PATTERN)
                .input('E', Items.SKULL_BANNER_PATTERN)
                .input('F', Items.GUSTER_BANNER_PATTERN)
                .input('G', Items.FLOWER_BANNER_PATTERN)
                .input('H', Items.CREEPER_BANNER_PATTERN)
                .input('I', Items.BLACK_BANNER)
                .criterion(hasItem(ModItems.QUESTION_MARK), conditionsFromItem(ModItems.QUESTION_MARK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.QUESTION_MARK_BLOCK2)
                .pattern("QQQ")
                .pattern("QQQ")
                .pattern("QQQ")
                .input('Q', ModBlocks.QUESTION_MARK_BLOCK)
                .criterion(hasItem(ModBlocks.QUESTION_MARK_BLOCK2), conditionsFromItem(ModBlocks.QUESTION_MARK_BLOCK2))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BUGGED_SWORD)
                .pattern(" Q ")
                .pattern(" N ")
                .pattern(" S ")
                .input('Q', ModBlocks.QUESTION_MARK_BLOCK)
                .input('S', Items.STICK)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModBlocks.QUESTION_MARK_BLOCK), conditionsFromItem(ModBlocks.QUESTION_MARK_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BUGGED_PICKAXE)
                .pattern("QNQ")
                .pattern(" S ")
                .pattern(" S ")
                .input('Q', ModBlocks.QUESTION_MARK_BLOCK)
                .input('S', Items.STICK)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModBlocks.QUESTION_MARK_BLOCK), conditionsFromItem(ModBlocks.QUESTION_MARK_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BUGGED_AXE)
                .pattern("QN ")
                .pattern("QS ")
                .pattern(" S ")
                .input('Q', ModBlocks.QUESTION_MARK_BLOCK)
                .input('S', Items.STICK)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModBlocks.QUESTION_MARK_BLOCK), conditionsFromItem(ModBlocks.QUESTION_MARK_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BUGGED_SHOVEL)
                .pattern(" Q ")
                .pattern(" S ")
                .pattern(" N ")
                .input('Q', ModBlocks.QUESTION_MARK_BLOCK)
                .input('S', Items.STICK)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModBlocks.QUESTION_MARK_BLOCK), conditionsFromItem(ModBlocks.QUESTION_MARK_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BUGGED_HOE)
                .pattern("QN ")
                .pattern(" S ")
                .pattern(" S ")
                .input('Q', ModBlocks.QUESTION_MARK_BLOCK)
                .input('S', Items.STICK)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModBlocks.QUESTION_MARK_BLOCK), conditionsFromItem(ModBlocks.QUESTION_MARK_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BUGGED_HELMET)
                .pattern("QNQ")
                .pattern("Q Q")
                .pattern("   ")
                .input('Q', ModBlocks.QUESTION_MARK_BLOCK)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModBlocks.QUESTION_MARK_BLOCK), conditionsFromItem(ModBlocks.QUESTION_MARK_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BUGGED_CHESTPLATE)
                .pattern("Q Q")
                .pattern("QNQ")
                .pattern("QQQ")
                .input('Q', ModBlocks.QUESTION_MARK_BLOCK)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModBlocks.QUESTION_MARK_BLOCK), conditionsFromItem(ModBlocks.QUESTION_MARK_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BUGGED_LEGGINGS)
                .pattern("QNQ")
                .pattern("Q Q")
                .pattern("Q Q")
                .input('Q', ModBlocks.QUESTION_MARK_BLOCK)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModBlocks.QUESTION_MARK_BLOCK), conditionsFromItem(ModBlocks.QUESTION_MARK_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BUGGED_BOOTS)
                .pattern("   ")
                .pattern("N N")
                .pattern("Q Q")
                .input('Q', ModBlocks.QUESTION_MARK_BLOCK)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModBlocks.QUESTION_MARK_BLOCK), conditionsFromItem(ModBlocks.QUESTION_MARK_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.BLAZING_PRONGS)
                .pattern("QQQ")
                .pattern("QQQ")
                .pattern("NNN")
                .input('Q', Items.BLAZE_ROD)
                .input('N', Items.NETHERITE_BLOCK)
                .criterion(hasItem(Items.NETHERITE_BLOCK), conditionsFromItem(Items.NETHERITE_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.QUESTION_MARK, 9)
                .input(ModBlocks.QUESTION_MARK_BLOCK)
                .criterion(hasItem(ModBlocks.QUESTION_MARK_BLOCK), conditionsFromItem(ModBlocks.QUESTION_MARK_BLOCK))
                .offerTo(exporter, Identifier.of(Devilsreject2.MOD_ID, "question_mark_from_question_mark_block"));

    }
}
