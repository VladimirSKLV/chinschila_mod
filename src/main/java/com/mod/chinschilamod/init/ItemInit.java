package com.mod.chinschilamod.init;

import com.mod.chinschilamod.ChinschilaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChinschilaMod.MOD_ID);

    public static final RegistryObject<Item> CHINCHILLA_SPAWN_EGG = ITEMS.register("chinchilla_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.CHINCHILLA, 0xF0F0F0, 0x6B6B6B,
                    new Item.Properties()));
}
