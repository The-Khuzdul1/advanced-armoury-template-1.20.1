package net.khuz.armourymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.khuz.armourymod.AdvancedArmoury;
import net.khuz.armourymod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ADVANCED_ARMOURY_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AdvancedArmoury.MOD_ID, "advancedarmouryblocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.advancedarmouryblocks"))
                    .icon(() -> new ItemStack(ModBlocks.DEEPSLATE_MITHRIL_ORE)) .entries((displayContext, entries) -> {
                        entries.add(Items.IRON_ORE);
                        entries.add(Items.DEEPSLATE_IRON_ORE);
                        entries.add(Items.COPPER_ORE);
                        entries.add(Items.DEEPSLATE_COPPER_ORE);
                        entries.add(Items.GOLD_ORE);
                        entries.add(Items.DEEPSLATE_GOLD_ORE);
                        entries.add(Items.NETHER_GOLD_ORE);
                        entries.add(Items.ANCIENT_DEBRIS);
                        entries.add(ModBlocks.DEEPSLATE_MITHRIL_ORE);
                        entries.add(ModBlocks.BALASKAR_ORE);
                        entries.add(ModBlocks.CABALISITE_ORE);
                        entries.add(ModBlocks.ENDERIUM_ORE);
                        entries.add(ModBlocks.VATHOSITE_ORE);
                        entries.add(Items.RAW_IRON_BLOCK);
                        entries.add(Items.RAW_COPPER_BLOCK);
                        entries.add(Items.RAW_GOLD_BLOCK);
                        entries.add(ModBlocks.ANVAR_BLOCK);
                        entries.add(ModBlocks.CAST_IRON_BLOCK);
                        entries.add(ModBlocks.FERROSECT_BLOCK);
                        entries.add(ModBlocks.ROSE_GOLD_BLOCK);
                        entries.add(ModBlocks.MITHRIL_BLOCK);
                        entries.add(ModBlocks.ECHEON_BLOCK);
                        entries.add(ModBlocks.SLAG_METAL_BLOCK);
                        entries.add(ModBlocks.BALASKAR_BLOCK);
                        entries.add(ModBlocks.CABALISITE_BLOCK);
                        entries.add(ModBlocks.ENDERIUM_BLOCK);
                        entries.add(ModBlocks.VATHOSITE_BLOCK);
                        entries.add(ModBlocks.STARSHOT_BLOCK);

                    }).build());

    public static final ItemGroup ADVANCED_ARMOURY_METALS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AdvancedArmoury.MOD_ID, "advancedarmourymetals"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.advancedarmourymetals"))
                    .icon(() -> new ItemStack(ModItems.MITHRIL_INGOT)) .entries((displayContext, entries) -> {
                        entries.add(Items.RAW_IRON);
                        entries.add(Items.RAW_COPPER);
                        entries.add(Items.RAW_GOLD);
                        entries.add(Items.NETHERITE_SCRAP);
                        entries.add(ModItems.RAW_MITHRIL);
                        entries.add(ModItems.RAW_BALASKAR);
                        entries.add(ModItems.RAW_ENDERIUM);
                        entries.add(ModItems.RAW_VATHOSITE);
                        entries.add(Items.IRON_INGOT);
                        entries.add(Items.COPPER_INGOT);
                        entries.add(Items.GOLD_INGOT);
                        entries.add(Items.NETHERITE_INGOT);
                        entries.add(ModItems.ANVAR_INGOT);
                        entries.add(ModItems.CAST_IRON_INGOT);
                        entries.add(ModItems.FERROSECT_INGOT);
                        entries.add(ModItems.CUPRISECT_INGOT);
                        entries.add(ModItems.AURESECT_INGOT);
                        entries.add(ModItems.FENGONITE_INGOT);
                        entries.add(ModItems.ROSE_GOLD_INGOT);
                        entries.add(ModItems.SLAG_METAL_INGOT);
                        entries.add(ModItems.MITHRIL_INGOT);
                        entries.add(ModItems.ECHEON_INGOT);
                        entries.add(ModItems.BALASKAR_INGOT);
                        entries.add(ModItems.ENDERIUM_INGOT);
                        entries.add(ModItems.VATHOSITE_INGOT);
                        entries.add(ModItems.STARSHOT_INGOT);
                        entries.add(Items.IRON_NUGGET);
                        entries.add(ModItems.COPPER_NUGGET);
                        entries.add(Items.GOLD_NUGGET);
                        entries.add(ModItems.NETHERITE_NUGGET);
                        entries.add(ModItems.ANVAR_NUGGET);
                        entries.add(ModItems.CAST_IRON_NUGGET);
                        entries.add(ModItems.FERROSECT_NUGGET);
                        entries.add(ModItems.CUPRISECT_NUGGET);
                        entries.add(ModItems.AURESECT_NUGGET);
                        entries.add(ModItems.FENGONITE_NUGGET);
                        entries.add(ModItems.ROSE_GOLD_NUGGET);
                        entries.add(ModItems.SLAG_METAL_NUGGET);
                        entries.add(ModItems.MITHRIL_NUGGET);
                        entries.add(ModItems.ECHEON_NUGGET);
                        entries.add(ModItems.BALASKAR_NUGGET);
                        entries.add(ModItems.ENDERIUM_NUGGET);
                        entries.add(ModItems.VATHOSITE_NUGGET);
                        entries.add(ModItems.STARSHOT_GEM);

                    }).build());

    public static final ItemGroup ADVANCED_ARMOURY_INGREDIENTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AdvancedArmoury.MOD_ID, "advancedarmouryingredients"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.advancedarmouryingredients"))
                    .icon(() -> new ItemStack(ModItems.CABALISITE_DUST)) .entries((displayContext, entries) -> {
                        entries.add(ModItems.ASH);
                        entries.add(ModItems.CABALISITE_DUST);
                        entries.add(ModItems.CABALISITE_GEM);
                        entries.add(ModItems.MYSTERIOUS_GEODE);
                        entries.add(ModItems.KYBER_CRYSTAL);
                        entries.add(ModItems.ATIUM_BEAD);
                        entries.add(ModItems.MALATIUM_NUGGET);
                        entries.add(ModItems.MYSTERIOUS_INGOT);
                        entries.add(ModItems.MYSTERIOUS_NUGGET);

                    }).build());

    public static void registerItemGroups(){
        AdvancedArmoury.LOGGER.info("Registering Item Groups for " + AdvancedArmoury.MOD_ID);
    }

}
