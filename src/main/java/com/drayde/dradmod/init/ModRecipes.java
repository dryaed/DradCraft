package com.drayde.dradmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER, 1), 1.0f);
		GameRegistry.addSmelting(ModBlocks.BASSIUM_ORE, new ItemStack(ModItems.BASSIUM_INGOT, 1), 3.0f);
	}
}
	
