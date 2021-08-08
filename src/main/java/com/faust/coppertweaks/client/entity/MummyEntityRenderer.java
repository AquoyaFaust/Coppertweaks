package com.faust.coppertweaks.client.entity;

import com.faust.coppertweaks.CopperTweaks;
import com.faust.coppertweaks.client.entity.model.MummyEntityModel;
import com.faust.coppertweaks.common.entity.MummyEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MummyEntityRenderer extends MobRenderer<MummyEntity, MummyEntityModel<MummyEntity>> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(CopperTweaks.MOD_ID,
			"textures/entity/mummy.png");

	public MummyEntityRenderer(EntityRendererManager manager) {
		super(manager, new MummyEntityModel<>(), 0.7f);
	}

	@Override
	public ResourceLocation getEntityTexture(MummyEntity entity) {
		return TEXTURE;
	}
}
