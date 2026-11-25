
package com.example.memecraft.items;

import com.example.memecraft.MemeCraft;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MEME_COIN = new MemeCoinItem(new Item.Settings());
    public static final Item CASINO_TICKET = new CasinoTicketItem(new Item.Settings());
    public static final Item MEME_DECK = new MemeDeckItem(new Item.Settings().maxCount(1));
    public static final Item RED_BUTTON = new RedButtonItem(new Item.Settings());
    public static final Item RK_PHONE = new RKPhoneItem(new Item.Settings().maxCount(1));
    public static final Item BANANA_ITEM = new Item(new Item.Settings());

    public static void register() {
        registerItem("meme_coin", MEME_COIN);
        registerItem("casino_ticket", CASINO_TICKET);
        registerItem("meme_deck", MEME_DECK);
        registerItem("red_button_item", RED_BUTTON);
        registerItem("rk_phone", RK_PHONE);
        registerItem("banana_item", BANANA_ITEM);
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(MemeCraft.MOD_ID, name), item);
    }
}
