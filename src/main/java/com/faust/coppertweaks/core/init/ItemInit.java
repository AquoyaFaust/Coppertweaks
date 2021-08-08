package com.faust.coppertweaks.core.init;

import com.faust.coppertweaks.CopperTweaks;
import com.faust.coppertweaks.common.material.CustomArmorMaterial;
import com.faust.coppertweaks.common.material.CustomToolMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			CopperTweaks.MOD_ID);

	public static final RegistryObject<Item> COPPER_RING = ITEMS.register("copper_ring",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> ROSEGOLD_INGOT = ITEMS.register("rosegold_ingot",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));

	public static final RegistryObject<Item> BRONZE = ITEMS.register("bronze_sword",
			() -> new SwordItem(CustomToolMaterial.BRONZE, 5, -2f,
					new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
			() -> new PickaxeItem(CustomToolMaterial.BRONZE, 3, -3f,
					new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
			() -> new ShovelItem(CustomToolMaterial.BRONZE, 1, -3f,
					new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe",
			() -> new AxeItem(CustomToolMaterial.BRONZE, 8, -3.3f,
					new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe",
			() -> new HoeItem(CustomToolMaterial.BRONZE, 1, -1f,
					new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", 
			() -> new ArmorItem(CustomArmorMaterial.BRONZE, EquipmentSlotType.HEAD,
					new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", 
			() -> new ArmorItem(CustomArmorMaterial.BRONZE, EquipmentSlotType.CHEST,
					new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", 
			() -> new ArmorItem(CustomArmorMaterial.BRONZE, EquipmentSlotType.LEGS,
					new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", 
			() -> new ArmorItem(CustomArmorMaterial.BRONZE, EquipmentSlotType.FEET,
					new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> PURIFIEDCOPPER_NUGGET = ITEMS.register("purifiedcopper_nugget",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> ROSEGOLD_PICKAXE = ITEMS.register("rosegold_pickaxe",
			() -> new PickaxeItem(CustomToolMaterial.ROSEGOLD, 3, -2f,
					new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> ROSEGOLD_AXE = ITEMS.register("rosegold_axe",
			() -> new AxeItem(CustomToolMaterial.ROSEGOLD, 3, -2f,
					new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> ROSEGOLD_SHOVEL = ITEMS.register("rosegold_shovel",
			() -> new ShovelItem(CustomToolMaterial.ROSEGOLD, 3, -2f,
					new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> ROSEGOLD_HOE = ITEMS.register("rosegold_hoe",
			() -> new HoeItem(CustomToolMaterial.ROSEGOLD, 3, -2f,
					new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> ROSEGOLD_SWORD = ITEMS.register("rosegold_sword",
			() -> new SwordItem(CustomToolMaterial.ROSEGOLD, 3, -2f,
					new Item.Properties().group(ItemGroup.COMBAT)));
	

	

	//public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("BRONZE",
			//() -> new ArmorItem(CustomArmorMaterial.BRONZE, EquipmentSlotType.HEAD,
			//		new Item.Properties().maxDamage(20).group(ItemGroup.COMBAT)));
}
