package com.faust.coppertweaks.common.material;

import java.util.function.Supplier;

import com.faust.coppertweaks.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum CustomToolMaterial implements IItemTier {
	
	BRONZE(2, 400, 6.5f, 2.0f, 9, () -> Ingredient.fromItems(ItemInit.BRONZE_INGOT.get())), //2, 250, 6.0F, 2.0F, 14
	ROSEGOLD(2, 300, 7.5f, 3.0f, 40, () -> Ingredient.fromItems(ItemInit.ROSEGOLD_INGOT.get()));
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairMaterial;
	
	CustomToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial.get();
	}	
	@Override
	public int getMaxUses() {
		return this.maxUses;
	}
	@Override
	public float getEfficiency() {
		return this.efficiency;
	}
	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}
	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}
	@Override
	public int getEnchantability() {
		return this.enchantability;
	}
	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial;
	}
}
