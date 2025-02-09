package com.mod.chinschilamod.init;

import com.mod.chinschilamod.ChinschilaMod;
import com.mod.chinschilamod.entity.ChinchillaEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ChinschilaMod.MOD_ID);

    public static final RegistryObject<EntityType<ChinchillaEntity>> CHINCHILLA = ENTITIES.register("chinchilla",
            () -> EntityType.Builder.of(ChinchillaEntity::new, MobCategory.CREATURE)
                    .sized(0.6f, 0.6f)
                    .build(new ResourceLocation(ChinschilaMod.MOD_ID, "chinchilla").toString()));
}
