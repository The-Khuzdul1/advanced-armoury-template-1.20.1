package net.khuz.armourymod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.khuz.armourymod.AdvancedArmoury;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BALASKAR_ORE = registerBlock("balaskar_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AdvancedArmoury.MOD_ID, name), block);
    }

    private static Item registerBlockItems(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AdvancedArmoury.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public  static void registerModBlocks() {
        AdvancedArmoury.LOGGER.info("Registering ModBlocks for " + AdvancedArmoury.MOD_ID);
    }
}