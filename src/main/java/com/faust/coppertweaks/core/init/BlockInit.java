
package com.faust.coppertweaks.core.init;

import com.faust.coppertweaks.CopperTweaks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			CopperTweaks.MOD_ID);

	public static final RegistryObject<Block> TIN_ORE = BLOCKS
			.register("tin_ore",
					() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_ORE)));
	
	public static final RegistryObject<Block> COPPER_ORE = BLOCKS
			.register("copper_ore",
					() -> new Block(AbstractBlock.Properties.from(Blocks.IRON_ORE)));

	// () -> new Block(Properties.of(Material.STONE, MaterialColor.COLOR_BLUE)
	// .harvestTool(ToolType.PICKAXE).harvestLevel(0).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1f)));
}
