package com.triumvirate.lmnts.init;

import com.triumvirate.lmnts.LMNts;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LMNts.MOD_ID);

	public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block",
			() -> new Block(Block.Properties.from(Blocks.COBBLESTONE)));
}
