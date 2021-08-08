package com.faust.coppertweaks.common.block;

import com.faust.coppertweaks.core.init.TileEntityTypesInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class SarcophagusBlock extends Block{

	public SarcophagusBlock( ) {
		super(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(2f)
				.sound(SoundType.STONE));
	}
	
	
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	public TileEntity createTileEntity(BlockState block, IBlockReader world) {
		return TileEntityTypesInit.SARCOPHAGUS_TILE_ENTITY_TYPE.get().create();
	}

}
