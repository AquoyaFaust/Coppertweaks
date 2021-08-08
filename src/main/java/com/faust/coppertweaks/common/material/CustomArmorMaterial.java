package com.faust.coppertweaks.common.material;

import java.util.function.Supplier;

import com.faust.coppertweaks.core.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum CustomArmorMaterial implements IArmorMaterial {
	BRONZE("bronze", 20, new int[] { 2, 5, 6, 3 }, 6, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1f, .2f,
			() -> Ingredient.fromItems(ItemInit.BRONZE_INGOT.get()));

	private static final int[] baseDurability = { 128, 144, 160, 112 };
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorVal;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Ingredient repairIngredient;

	CustomArmorMaterial(String name, int durabilityMultiplier, int[] armorVal, int enchantablity, SoundEvent equipSound,
			float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorVal = armorVal;
		this.enchantability = enchantablity;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient.get();
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return baseDurability[slotIn.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.armorVal[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairIngredient;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}

}
