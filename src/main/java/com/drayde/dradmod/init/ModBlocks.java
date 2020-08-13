package com.drayde.dradmod.init;

import java.util.ArrayList;
import java.util.List;

import com.drayde.dradmod.blocks.BassiumBlock;
import com.drayde.dradmod.blocks.BassiumOre;
import com.drayde.dradmod.blocks.BlockBase;
import com.drayde.dradmod.blocks.IronBasedBlocks;
import com.drayde.dradmod.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block DECORATIVE_IRON_BLOCK = new IronBasedBlocks("decorative_iron_block", Material.IRON);
	public static final Block BASSIUM_ORE = new BassiumOre("bassium_ore", Material.IRON);
	public static final Block BASSIUM_BLOCK = new BassiumBlock("bassium_block", Material.IRON);
}
