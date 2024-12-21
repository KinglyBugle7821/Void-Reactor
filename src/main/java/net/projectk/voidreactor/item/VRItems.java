package net.projectk.voidreactor.item;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.projectk.voidreactor.VoidReactor;

import java.util.List;

public class VRItems {

    public static final Item DARKFIRE_ESSENCE = registerItem("darkfire_essence", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
            if(Screen.hasShiftDown()){
                tooltip.add(Text.translatable("tooltip.void_reactor.darkfire_essence"));
            } else {
                tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
            }
            super.appendTooltip(stack, context, tooltip, options);
        }
    });
    public static final Item GENERO_PLASMA = registerItem("genero_plasma", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
            if(Screen.hasShiftDown()){
                tooltip.add(Text.translatable("tooltip.void_reactor.genero_plasma"));
            } else {
                tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
            }
            super.appendTooltip(stack, context, tooltip, options);
        }
    });

    public static final Item RAW_CYMIN = registerItem("raw_cymin", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
            if(Screen.hasShiftDown()){
                tooltip.add(Text.translatable("tooltip.void_reactor.raw_cymin"));
            } else {
                tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
            }
            super.appendTooltip(stack, context, tooltip, options);
        }
    });
    public static final Item CYMIN_INGOT = registerItem("cymin_ingot", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
            if(Screen.hasShiftDown()){
                tooltip.add(Text.translatable("tooltip.void_reactor.cymin_ingot"));
            } else {
                tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
            }
            super.appendTooltip(stack, context, tooltip, options);
        }
    });
    public static final Item CYMIN_NUGGET = registerItem("cymin_nugget", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
            if(Screen.hasShiftDown()){
                tooltip.add(Text.translatable("tooltip.void_reactor.cymin_nugget"));
            } else {
                tooltip.add(Text.translatable("tooltip.void_reactor.press_shift"));
            }
            super.appendTooltip(stack, context, tooltip, options);
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VoidReactor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VoidReactor.LOGGER.info("Registering Mod Items for " + VoidReactor.MOD_ID);
    }
}
