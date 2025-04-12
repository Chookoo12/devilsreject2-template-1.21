package net.chookoo.devilsreject2;

import net.chookoo.devilsreject2.block.ModBlocks;
import net.chookoo.devilsreject2.item.ModItemGroups;
import net.chookoo.devilsreject2.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Devilsreject2 implements ModInitializer {
	public static final String MOD_ID = "devilsreject2";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}