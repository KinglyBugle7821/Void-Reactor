package net.projectk.voidreactor.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.projectk.voidreactor.VoidReactor;

public class VRItems {

    public static final Item DARKFIRE_ESSENCE = registerItem("darkfire_essence", new Item(new Item.Settings()));
    public static final Item GENERO_PLASMA = registerItem("genero_plasma", new Item(new Item.Settings()));

    public static final Item RAW_CYMIN = registerItem("raw_cymin", new Item(new Item.Settings()));
    public static final Item CYMIN_INGOT = registerItem("cymin_ingot", new Item(new Item.Settings()));
    public static final Item CYMIN_NUGGET = registerItem("cymin_nugget", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VoidReactor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VoidReactor.LOGGER.info("Registering Mod Items for " + VoidReactor.MOD_ID);
    }
}
