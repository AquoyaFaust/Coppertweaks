package com.faust.coppertweaks.common.te;

import com.faust.coppertweaks.CopperTweaks;
import com.faust.coppertweaks.common.container.AlloySmelterContainer;
import com.faust.coppertweaks.core.init.TileEntityTypesInit;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class AlloySmelterTileEntity extends LockableLootTileEntity{
	
	public static int slots = 1;
	
	protected NonNullList<ItemStack> items = NonNullList.withSize(slots, ItemStack.EMPTY);
	
	protected AlloySmelterTileEntity(TileEntityType<?> typeIn) {
		super(typeIn);
	}
	
	public AlloySmelterTileEntity() {
		this(TileEntityTypesInit.ALLOY_SMELTER_ENTITY_TYPE.get());
	}

	@Override
	public int getSizeInventory() {
		return slots;
	}

	@Override
	protected NonNullList<ItemStack> getItems() {
		return items;
	}

	@Override
	protected void setItems(NonNullList<ItemStack> itemsIn) {
		this.items = itemsIn;
		
	}

	@Override
	protected ITextComponent getDefaultName() {
		return new TranslationTextComponent("container." + CopperTweaks.MOD_ID + ".alloy_smelter");
	}

	@Override
	protected Container createMenu(int id, PlayerInventory player) {
		return new AlloySmelterContainer(id, player, this);
	}
	
	@Override
	public CompoundNBT write(CompoundNBT compound) {
		super.write(compound);
		if(!this.checkLootAndWrite(compound)) {
			ItemStackHelper.saveAllItems(compound, this.items);
		}
		
		return compound;
	}
	
	@Override
	public void read(BlockState state, CompoundNBT nbt) {
		super.read(state, nbt);
		this.items = NonNullList.withSize(getSizeInventory(), ItemStack.EMPTY);
		if (!this.checkLootAndRead(nbt)) {
			ItemStackHelper.loadAllItems(nbt, this.items);
		}
	}

}
