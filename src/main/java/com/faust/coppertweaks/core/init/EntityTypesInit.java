package com.faust.coppertweaks.core.init;

import com.faust.coppertweaks.CopperTweaks;
import com.faust.coppertweaks.common.entity.MummyEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypesInit {

	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			CopperTweaks.MOD_ID);
	/*
	public static final RegistryObject<EntityType<MummyEntity>> MUMMY = ENTITY_TYPES.register("mummy",
			() -> EntityType.Builder.create(MummyEntity::new, EntityClassification.MONSTER).size(2.0f, 2.0f)
					.build(new ResourceLocation(CopperTweaks.MOD_ID, "mummy").toString()));
	*/
	public static final RegistryObject<EntityType<MummyEntity>> MUMMY = ENTITY_TYPES.register("mummy", 
			() -> EntityType.Builder.create(MummyEntity::new, EntityClassification.MONSTER).size(1.0f, 1.0f)
				.build(new ResourceLocation(CopperTweaks.MOD_ID, "mummy").toString()));
}