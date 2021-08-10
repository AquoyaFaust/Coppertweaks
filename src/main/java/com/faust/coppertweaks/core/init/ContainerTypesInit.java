package com.faust.coppertweaks.core.init;

import com.faust.coppertweaks.CopperTweaks;
import com.faust.coppertweaks.common.container.AlloySmelterContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerTypesInit {
	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPE = DeferredRegister
			.create(ForgeRegistries.CONTAINERS, CopperTweaks.MOD_ID);
	
	public static final RegistryObject<ContainerType<AlloySmelterContainer>> ALLOY_SMELTER_CONTAINER_TYPE = 
			CONTAINER_TYPE.register("alloy_smelter", () -> IForgeContainerType.create(AlloySmelterContainer::new));
}
