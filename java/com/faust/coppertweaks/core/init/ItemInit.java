package com.faust.coppertweaks.core.init;

import com.faust.coppertweaks.CopperTweaks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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
	
	public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
			() -> new Item(new Item.Properties().maxDamage(20).maxStackSize(1).group(ItemGroup.COMBAT)));

}
