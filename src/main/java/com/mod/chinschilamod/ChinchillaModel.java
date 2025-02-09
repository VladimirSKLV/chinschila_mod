package com.mod.chinschilamod;

import com.mod.chinschilamod.entity.ChinchillaEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ChinchillaModel extends GeoModel<ChinchillaEntity> {
    @Override
    public ResourceLocation getModelResource(ChinchillaEntity object) {
        return new ResourceLocation(ChinschilaMod.MOD_ID, "geo/chinchilla.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChinchillaEntity object) {
        return new ResourceLocation(ChinschilaMod.MOD_ID, "textures/entity/chinchilla.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChinchillaEntity animatable) {
        return new ResourceLocation(ChinschilaMod.MOD_ID, "animations/chinchilla.animation.json");
    }
}
