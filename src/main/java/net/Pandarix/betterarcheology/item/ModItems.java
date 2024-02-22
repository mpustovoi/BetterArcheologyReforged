package net.Pandarix.betterarcheology.item;

import net.Pandarix.betterarcheology.BetterArcheology;
import net.minecraft.world.item.BrushItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    // Create a Deferred Register to hold Items which will all be registered under the "BetterArcheology" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterArcheology.MOD_ID);

    //ITEM ENTRIES-------------------------------------------------------------------------//
    //BRUSHES
    public static final RegistryObject<Item> IRON_BRUSH = ITEMS.register("iron_brush", () -> new BrushItem(new Item.Properties().durability(128)));
    public static final RegistryObject<Item> DIAMOND_BRUSH = ITEMS.register("diamond_brush", () -> new BrushItem(new Item.Properties().durability(256)));

    //ARTIFACTS
    public static final RegistryObject<Item> ARTIFACT_SHARDS = ITEMS.register("artifact_shards", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> UNIDENTIFIED_ARTIFACT = ITEMS.register("unidentified_artifact", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));


    //LOOT ITEMS
    public static final RegistryObject<Item> BOMB_ITEM = ITEMS.register("bomb", () -> new BombItem(new Item.Properties().rarity(Rarity.COMMON).stacksTo(16)));
    public static final RegistryObject<Item> TORRENT_TOTEM = ITEMS.register("torrent_totem", () -> new TorrentTotemItem(new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1).durability(32)));
    public static final RegistryObject<Item> SOUL_TOTEM = ITEMS.register("soul_totem", () -> new SoulTotemItem(new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1).durability(32)));
}
