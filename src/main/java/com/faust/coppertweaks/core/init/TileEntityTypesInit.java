package com.faust.coppertweaks.core.init;

import com.faust.coppertweaks.CopperTweaks;
import com.faust.coppertweaks.common.te.AlloySmelterTileEntity;
import com.faust.coppertweaks.common.te.SarcophagusTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypesInit {
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
			.create(ForgeRegistries.TILE_ENTITIES, CopperTweaks.MOD_ID);

	public static final RegistryObject<TileEntityType<SarcophagusTileEntity>> SARCOPHAGUS_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
			.register("sarcophagus", () -> TileEntityType.Builder.create(SarcophagusTileEntity::new, BlockInit.SARCOPHAGUS.get()).build(null));
	
	public static final RegistryObject<TileEntityType<AlloySmelterTileEntity>> ALLOY_SMELTER_ENTITY_TYPE = TILE_ENTITY_TYPE
			.register("alloy_smelter", () -> TileEntityType.Builder.create(AlloySmelterTileEntity::new, BlockInit.ALLOY_SMELTER.get()).build(null));
	
}
