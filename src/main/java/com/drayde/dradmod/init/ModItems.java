package com.drayde.dradmod.init;

import java.util.ArrayList;
import java.util.List;

import com.drayde.dradmod.items.ItemBase;
import com.drayde.dradmod.items.armor.ArmorBassium;
import com.drayde.dradmod.items.tools.ToolAxe;
import com.drayde.dradmod.items.tools.ToolHoe;
import com.drayde.dradmod.items.tools.ToolPickaxe;
import com.drayde.dradmod.items.tools.ToolSpade;
import com.drayde.dradmod.items.tools.ToolSword;
import com.drayde.dradmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Materials
	public static final ToolMaterial MATERIAL_BASSIUM = EnumHelper.addToolMaterial("material_bassium", 3, 1024, 10.0F, 3.0F, 12);
	public static final ArmorMaterial ARMOR_MATERIAL_BASSIUM = EnumHelper.addArmorMaterial("armor_material_bassium", Reference.MOD_ID + ":bassium", 10, new int[] {3, 6, 8, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	
	// Items
	public static final Item IRON_PLATE = new ItemBase("iron_plate");
	public static final Item GOLD_PLATE = new ItemBase("gold_plate");
	public static final Item BASSIUM_INGOT = new ItemBase("bassium_ingot");
	public static final Item BASSIUM_NUGGET = new ItemBase("bassium_nugget");
	
	// Tools
	public static final ItemSword BASSIUM_SWORD = new ToolSword("bassium_sword", MATERIAL_BASSIUM);
	public static final ItemSpade BASSIUM_SPADE = new ToolSpade("bassium_spade", MATERIAL_BASSIUM);
	public static final ItemPickaxe BASSIUM_PICKAXE = new ToolPickaxe("bassium_pickaxe", MATERIAL_BASSIUM);
	public static final ItemAxe BASSIUM_AXE = new ToolAxe("bassium_axe", MATERIAL_BASSIUM);
	public static final ItemHoe BASSIUM_HOE = new ToolHoe("bassium_hoe", MATERIAL_BASSIUM);
	
	// Armour
	public static final Item BASSIUM_HELMET = new ArmorBassium("bassium_helmet", ARMOR_MATERIAL_BASSIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item BASSIUM_CHESTPLATE = new ArmorBassium("bassium_chestplate", ARMOR_MATERIAL_BASSIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item BASSIUM_LEGGINGS = new ArmorBassium("bassium_leggings", ARMOR_MATERIAL_BASSIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BASSIUM_BOOTS = new ArmorBassium("bassium_boots", ARMOR_MATERIAL_BASSIUM, 1, EntityEquipmentSlot.FEET);
}
