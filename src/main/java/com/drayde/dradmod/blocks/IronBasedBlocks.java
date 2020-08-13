package com.drayde.dradmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class IronBasedBlocks extends BlockBase {

	public IronBasedBlocks(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(FLOAT);
		//setLightOpacity(int);
		//setBlockUnbreakable();
	}
	
	

}
