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

    public static final Block ANVAR_BLOCK = registerBlock("anvar_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BALASKAR_BLOCK = registerBlock("balaskar_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BALASKAR_ORE = registerBlock("balaskar_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACKSTONE)));
    public static final Block CABALISITE_BLOCK = registerBlock("cabalisite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK)));
    public static final Block CABALISITE_ORE = registerBlock("cabalisite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.BASALT)));
    public static final Block CAST_IRON_BLOCK = registerBlock("cast_iron_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block DEEPSLATE_MITHRIL_ORE = registerBlock("deepslate_mithril_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).strength(6.0f, 5.0f)));
    public static final Block ECHEON_BLOCK = registerBlock("echeon_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(6.0f, 7.0f)));
    public static final Block ENDERIUM_BLOCK = registerBlock("enderium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block ENDERIUM_ORE = registerBlock("enderium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(3.5f, 9.0f)));
    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(6.0f, 7.0f)));
    public static final Block ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block SLAG_METAL_BLOCK = registerBlock("slag_metal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block STARSHOT_BLOCK = registerBlock("starshot_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(7.5f, 9.5f)));
    public static final Block FERROSECT_BLOCK = registerBlock("ferrosect_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block VATHOSITE_BLOCK = registerBlock("vathosite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(6.0f, 7.0f)));
    public static final Block VATHOSITE_ORE = registerBlock("vathosite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4.0f, 9.5f)));
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
