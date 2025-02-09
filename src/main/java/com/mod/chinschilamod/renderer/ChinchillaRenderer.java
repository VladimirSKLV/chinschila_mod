package com.mod.chinschilamod.renderer;

import com.mod.chinschilamod.ChinchillaModel;
import com.mod.chinschilamod.ChinschilaMod;
import com.mod.chinschilamod.entity.ChinchillaEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ChinchillaRenderer extends GeoEntityRenderer<ChinchillaEntity> {
    public ChinchillaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ChinchillaModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull ChinchillaEntity entity) {
        return new ResourceLocation(ChinschilaMod.MOD_ID, "textures/entity/chinchilla.png");
    }
}
