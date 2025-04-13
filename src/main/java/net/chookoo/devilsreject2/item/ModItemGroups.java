package net.chookoo.devilsreject2.item;

import net.chookoo.devilsreject2.Devilsreject2;
import net.chookoo.devilsreject2.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DEVILS_REJECT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Devilsreject2.MOD_ID, "devils_reject_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BLAZING_PRONGS))
                    .displayName(Text.translatable("itemgroup.devilsreject2.devils_reject_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MYSTERIOUS_SHAFT);
                        entries.add(ModItems.BLAZING_PRONGS);
                        entries.add(ModItems.QUESTION_MARK);

                        entries.add(ModItems.BUGGED_SWORD);
                        entries.add(ModItems.BUGGED_PICKAXE);
                        entries.add(ModItems.BUGGED_AXE);
                        entries.add(ModItems.BUGGED_SHOVEL);
                        entries.add(ModItems.BUGGED_HOE);

                    }).build());

    public static final ItemGroup DEVILS_REJECT_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Devilsreject2.MOD_ID, "devils_reject_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.QUESTION_MARK_BLOCK))
                    .displayName(Text.translatable("itemgroup.devilsreject2.devils_reject_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.QUESTION_MARK_BLOCK);

                        entries.add(ModBlocks.QUESTION_MARK_BLOCK2);
                    }).build());



    public static void registerItemGroups() {
        Devilsreject2.LOGGER.info("Registering Item Groups for " + Devilsreject2.MOD_ID);
    }
}
