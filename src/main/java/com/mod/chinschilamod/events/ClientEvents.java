package com.mod.chinschilamod.events;

import com.mod.chinschilamod.ChinschilaMod;
import com.mod.chinschilamod.init.EntityInit;
import com.mod.chinschilamod.renderer.ChinchillaRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ChinschilaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.CHINCHILLA.get(), ChinchillaRenderer::new);
    }
}
