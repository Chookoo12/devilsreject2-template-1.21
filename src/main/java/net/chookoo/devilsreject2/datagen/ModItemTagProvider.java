package net.chookoo.devilsreject2.datagen;

import net.chookoo.devilsreject2.item.ModItems;
import net.chookoo.devilsreject2.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(Items.NETHERITE_BLOCK);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.BUGGED_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.BUGGED_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.BUGGED_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.BUGGED_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.BUGGED_HOE);
    }
}
