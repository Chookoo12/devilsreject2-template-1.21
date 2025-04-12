package net.chookoo.devilsreject2.item;

import net.chookoo.devilsreject2.Devilsreject2;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item QUESTION_MARK = registerItem("question_mark", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.devilsreject2.question_mark.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item MYSTERIOUS_SHAFT = registerItem("mysterious_shaft", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.devilsreject2.mysterious_shaft.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item BLAZING_PRONGS = registerItem("blazing_prongs", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.devilsreject2.blazing_prongs.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Devilsreject2.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Devilsreject2.LOGGER.info("Registering Mod Items for " + Devilsreject2.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(QUESTION_MARK);
            entries.add(BLAZING_PRONGS);
            entries.add(MYSTERIOUS_SHAFT);
        });
    }
}
