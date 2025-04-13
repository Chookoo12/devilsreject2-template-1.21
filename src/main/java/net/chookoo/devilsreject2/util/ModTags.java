package net.chookoo.devilsreject2.util;

import net.chookoo.devilsreject2.Devilsreject2;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_BUGGED_TOOL = createTag("needs_bugged_tool");
        public static final TagKey<Block> INCORRECT_FOR_BUGGED_TOOL = createTag("incorrect_for_bugged_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Devilsreject2.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Devilsreject2.MOD_ID, name));
        }
    }

}
