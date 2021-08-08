package com.faust.coppertweaks.core.init;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeatureInit {

	public static void addOres(final BiomeLoadingEvent event) {
		if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
			addOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.TIN_ORE.get().getDefaultState(), 2, 15, 80, 8);
			addOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.TIN_ORE.get().getDefaultState(), 5, 1, 15, 8);
			addOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.COPPER_ORE.get().getDefaultState(), 5, 20, 70, 15);
		}
	}

	private static void addOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize,
			int minHeight, int maxHeight, int perChunk) {
		settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
				Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
						.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
						.square().func_242731_b(perChunk));

	}

}
