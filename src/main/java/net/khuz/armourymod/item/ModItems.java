package net.khuz.armourymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.khuz.armourymod.AdvancedArmoury;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ANVAR_INGOT = registerItem("anvar_ingot", new Item(new FabricItemSettings()));
    public static final Item ANVAR_NUGGET = registerItem("anvar_nugget", new Item(new FabricItemSettings()));
    public static final Item ASH = registerItem("ash", new Item(new FabricItemSettings()));
    public static final Item ATIUM_BEAD = registerItem("atium_bead", new Item(new FabricItemSettings()));
    public static final Item AURESECT_INGOT = registerItem("auresect_ingot", new Item(new FabricItemSettings()));
    public static final Item AURESECT_NUGGET = registerItem("auresect_nugget", new Item(new FabricItemSettings()));
    public static final Item BALASKAR_INGOT = registerItem("balaskar_ingot", new Item(new FabricItemSettings()));
    public static final Item BALASKAR_NUGGET = registerItem("balaskar_nugget", new Item(new FabricItemSettings()));
    public static final Item CABALISITE_DUST = registerItem("cabalisite_dust", new Item(new FabricItemSettings()));
    public static final Item CABALISITE_GEM = registerItem("cabalisite_gem", new Item(new FabricItemSettings()));
    public static final Item CAST_IRON_INGOT = registerItem("cast_iron_ingot", new Item(new FabricItemSettings()));
    public static final Item CAST_IRON_NUGGET = registerItem("cast_iron_nugget", new Item(new FabricItemSettings()));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));
    public static final Item CUPRISECT_INGOT = registerItem("cuprisect_ingot", new Item(new FabricItemSettings()));
    public static final Item CUPRISECT_NUGGET = registerItem("cuprisect_nugget", new Item(new FabricItemSettings()));
    public static final Item ECHEON_INGOT = registerItem("echeon_ingot", new Item(new FabricItemSettings()));
    public static final Item ECHEON_NUGGET = registerItem("echeon_nugget", new Item(new FabricItemSettings()));
    public static final Item ENDERIUM_INGOT = registerItem("enderium_ingot", new Item(new FabricItemSettings()));
    public static final Item ENDERIUM_NUGGET = registerItem("enderium_nugget", new Item(new FabricItemSettings()));
    public static final Item FERROSECT_INGOT = registerItem("ferrosect_ingot", new Item(new FabricItemSettings()));
    public static final Item FERROSECT_NUGGET = registerItem("ferrosect_nugget", new Item(new FabricItemSettings()));
    public static final Item FENGONITE_INGOT = registerItem("fengonite_ingot", new Item(new FabricItemSettings()));
    public static final Item FENGONITE_NUGGET = registerItem("fengonite_nugget", new Item(new FabricItemSettings()));
    public static final Item KYBER_CRYSTAL = registerItem("kyber_crystal", new Item(new FabricItemSettings()));
    public static final Item MALATIUM_NUGGET = registerItem("malatium_nugget", new Item(new FabricItemSettings()));
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot", new Item(new FabricItemSettings()));
    public static final Item MITHRIL_NUGGET = registerItem("mithril_nugget", new Item(new FabricItemSettings()));
    public static final Item MYSTERIOUS_GEODE = registerItem("mysterious_geode", new Item(new FabricItemSettings()));
    public static final Item MYSTERIOUS_INGOT = registerItem("mysterious_ingot", new Item(new FabricItemSettings()));
    public static final Item MYSTERIOUS_NUGGET = registerItem("mysterious_nugget", new Item(new FabricItemSettings()));
    public static final Item NETHERITE_NUGGET = registerItem("netherite_nugget", new Item(new FabricItemSettings()));
    public static final Item RAW_BALASKAR = registerItem("raw_balaskar", new Item(new FabricItemSettings()));
    public static final Item RAW_ENDERIUM = registerItem("raw_enderium", new Item(new FabricItemSettings()));
    public static final Item RAW_MITHRIL = registerItem("raw_mithril", new Item(new FabricItemSettings()));
    public static final Item RAW_VATHOSITE = registerItem("raw_vathosite", new Item(new FabricItemSettings()));
    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot", new Item(new FabricItemSettings()));
    public static final Item ROSE_GOLD_NUGGET = registerItem("rose_gold_nugget", new Item(new FabricItemSettings()));
    public static final Item SLAG_METAL_INGOT = registerItem("slag_metal_ingot", new Item(new FabricItemSettings()));
    public static final Item SLAG_METAL_NUGGET = registerItem("slag_metal_nugget", new Item(new FabricItemSettings()));
    public static final Item STARSHOT_INGOT = registerItem("starshot_ingot", new Item(new FabricItemSettings()));
    public static final Item STARSHOT_GEM = registerItem("starshot_gem", new Item(new FabricItemSettings()));
    public static final Item VATHOSITE_INGOT = registerItem("vathosite_ingot", new Item(new FabricItemSettings()));
    public static final Item VATHOSITE_NUGGET = registerItem("vathosite_nugget", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(ASH);
        entries.add(CABALISITE_DUST);
        entries.add(CABALISITE_GEM);
        entries.add(MYSTERIOUS_GEODE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AdvancedArmoury.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AdvancedArmoury.LOGGER.info("Registering Mod Items for " + AdvancedArmoury.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
