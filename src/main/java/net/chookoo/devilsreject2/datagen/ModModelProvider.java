package net.chookoo.devilsreject2.datagen;

import net.chookoo.devilsreject2.block.ModBlocks;
import net.chookoo.devilsreject2.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUESTION_MARK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUESTION_MARK_BLOCK2);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MYSTERIOUS_SHAFT, Models.GENERATED);
        itemModelGenerator.register(ModItems.QUESTION_MARK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAZING_PRONGS, Models.GENERATED);
    }
}
