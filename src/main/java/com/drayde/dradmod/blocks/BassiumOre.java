package com.drayde.dradmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BassiumOre extends BlockBase{

	public BassiumOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
}
