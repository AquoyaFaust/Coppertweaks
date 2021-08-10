package com.faust.coppertweaks.common.block;

import com.faust.coppertweaks.common.te.AlloySmelterTileEntity;
import com.faust.coppertweaks.core.init.TileEntityTypesInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class AlloySmelterBlock extends Block{
	
	public AlloySmelterBlock( ) {
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
	
	@SuppressWarnings("deprecation")
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		if(!worldIn.isRemote()) {
			TileEntity te = worldIn.getTileEntity(pos);
			if (te instanceof AlloySmelterTileEntity) {
				NetworkHooks.openGui((ServerPlayerEntity) player, (AlloySmelterTileEntity) te, pos);
			}
			
		}
		return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
	}
}
