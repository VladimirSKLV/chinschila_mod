package com.mod.chinschilamod;

import com.mod.chinschilamod.entity.ChinchillaEntity;
import com.mod.chinschilamod.init.EntityInit;
import com.mod.chinschilamod.init.ItemInit;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ChinschilaMod.MOD_ID)
public class ChinschilaMod {
    public static final String MOD_ID = "chinschilamod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ChinschilaMod(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        EntityInit.ENTITIES.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {
        @SubscribeEvent
        public static void entityAttributes(EntityAttributeCreationEvent event) {
            event.put(EntityInit.CHINCHILLA.get(), ChinchillaEntity.createAttributes().build());
        }
    }
}
