package net.chookoo.devilsreject2.datagen;

import net.chookoo.devilsreject2.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_BUGGED_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

    }
}
