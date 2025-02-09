package com.mod.chinschilamod.tabs;

import com.mod.chinschilamod.ChinschilaMod;
import com.mod.chinschilamod.init.EntityInit;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Objects;

@Mod.EventBusSubscriber(modid = ChinschilaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab CHINCHILLA_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        CHINCHILLA_TAB = event.registerCreativeModeTab(
                new ResourceLocation(ChinschilaMod.MOD_ID, "chinchilla_tab"),
                builder -> builder
                        .icon(() -> new ItemStack(Items.EGG))
                        .title(Component.translatable("creativetab.chinchilla_tab"))
        );
    }

    @SubscribeEvent
    public static void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CHINCHILLA_TAB) {
            event.accept(Items.EGG);
            event.accept(Objects.requireNonNull(ForgeSpawnEggItem.fromEntityType(EntityInit.CHINCHILLA.get())));
        }
    }
}


