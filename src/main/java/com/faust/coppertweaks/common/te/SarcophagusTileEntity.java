package com.faust.coppertweaks.common.te;

import com.faust.coppertweaks.core.init.TileEntityTypesInit;

import net.minecraft.block.Blocks;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class SarcophagusTileEntity extends TileEntity implements ITickableTileEntity{

	public SarcophagusTileEntity(TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
	}
	
	public SarcophagusTileEntity() {
		this(TileEntityTypesInit.SARCOPHAGUS_TILE_ENTITY_TYPE.get());
	}

	@Override
	public void tick() {
		
		this.world.setBlockState(this.pos.down(), Blocks.AIR.getDefaultState());
		
	}
	
}
