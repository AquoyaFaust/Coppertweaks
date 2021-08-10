package com.faust.coppertweaks.core.util;

import com.faust.coppertweaks.CopperTweaks;
import com.faust.coppertweaks.client.screen.AlloySmelterScreen;
import com.faust.coppertweaks.core.init.ContainerTypesInit;

import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = CopperTweaks.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		ScreenManager.registerFactory(ContainerTypesInit.ALLOY_SMELTER_CONTAINER_TYPE.get(), AlloySmelterScreen::new);
	}
}
