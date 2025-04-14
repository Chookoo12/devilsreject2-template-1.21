package net.chookoo.devilsreject2.item;

import net.chookoo.devilsreject2.Devilsreject2;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
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

    public static final Item BUGGED_SWORD = registerItem("bugged_sword",
            new SwordItem(ModToolMaterials.BUGGED, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BUGGED,3, -2.4f))));
    public static final Item BUGGED_PICKAXE = registerItem("bugged_pickaxe",
            new PickaxeItem(ModToolMaterials.BUGGED, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.BUGGED,1, -2.8f))));
    public static final Item BUGGED_SHOVEL = registerItem("bugged_shovel",
            new ShovelItem(ModToolMaterials.BUGGED, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.BUGGED,1.5f, -3.0f))));
    public static final Item BUGGED_AXE = registerItem("bugged_axe",
            new AxeItem(ModToolMaterials.BUGGED, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.BUGGED,6, -3.2f))));
    public static final Item BUGGED_HOE = registerItem("bugged_hoe",
            new HoeItem(ModToolMaterials.BUGGED, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.BUGGED,0, -3f))));

    public static final Item BUGGED_HELMET = registerItem("bugged_helmet",
            new ArmorItem(ModArmorMaterials.BUGGED_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));
    public static final Item BUGGED_CHESTPLATE = registerItem("bugged_chestplate",
            new ArmorItem(ModArmorMaterials.BUGGED_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));
    public static final Item BUGGED_LEGGINGS = registerItem("bugged_leggings",
            new ArmorItem(ModArmorMaterials.BUGGED_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));
    public static final Item BUGGED_BOOTS = registerItem("bugged_boots",
            new ArmorItem(ModArmorMaterials.BUGGED_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));


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
