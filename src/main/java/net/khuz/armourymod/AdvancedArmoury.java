package net.khuz.armourymod;

import net.fabricmc.api.ModInitializer;

import net.khuz.armourymod.item.ModItemGroups;
import net.khuz.armourymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancedArmoury implements ModInitializer {
	public static final String MOD_ID = "advancedarmoury";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}