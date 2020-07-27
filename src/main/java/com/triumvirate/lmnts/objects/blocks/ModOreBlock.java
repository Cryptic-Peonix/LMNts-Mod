package com.triumvirate.lmnts.objects.blocks;

import java.util.Random;

import com.triumvirate.lmnts.init.BlockInit;

import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

public class ModOreBlock extends OreBlock {

	public ModOreBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	protected int getExperience(Random rand) {
		if (this == BlockInit.SHOCK_CRYSTAL_ORE.get()) {
			return MathHelper.nextInt(rand, 2, 5);
		} else {
			return this == BlockInit.TEST_BLOCK.get() ? MathHelper.nextInt(rand, 0, 2) : 0;
		}
	}
}
