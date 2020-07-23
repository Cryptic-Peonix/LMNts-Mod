package com.triumvirate.lmnts.init;

import com.triumvirate.lmnts.LMNts;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LMNts.MOD_ID);

	public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block",
			() -> new Block(Block.Properties.from(Blocks.COBBLESTONE)));

	public static final RegistryObject<Block> REINFORCED_STONE = BLOCKS.register("reinforced_stone",
			() -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(10f, 30f).harvestLevel(2)
					.harvestTool(ToolType.PICKAXE).func_235861_h_().sound(SoundType.STONE)));
}
