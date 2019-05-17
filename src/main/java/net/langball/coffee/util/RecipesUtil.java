package net.langball.coffee.util;

import net.langball.coffee.CoffeeWork;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RecipesUtil {
	public static void addRecipe(Item item, IRecipe value) {
	addRecipe(item.getRegistryName().toString().replaceAll(":", "."), value, false);
	}
	public static void addRecipe(Block item, IRecipe value) {
	addRecipe(item.getRegistryName().toString().replaceAll(":", "."), value, false);
	}
	public static void addRecipe(String key, IRecipe value) {
    addRecipe(key, value, false);
	}
	public static void addRecipe(String key, IRecipe value, boolean isDummy) {
    if(!isDummy) {
        if(value.getRegistryName() == null)
            value.setRegistryName(new ResourceLocation(CoffeeWork.MODID,key));
        ForgeRegistries.RECIPES.register(value);
    	}
	}
	public static void addOreDictionarySmelting(String ore,ItemStack output,float exp){
		for(ItemStack item :OreDictionary.getOres(ore)){
			GameRegistry.addSmelting(item, output, exp);
		}
	}
	public static void addOreDictionarySmelting(String ore,ItemStack output){
		for(ItemStack item :OreDictionary.getOres(ore)){
			GameRegistry.addSmelting(item, output, 0F);
		}
	}
    public static NBTTagCompound getItemTagCompound(ItemStack stack){
		NBTTagCompound tag;
		if(stack.hasTagCompound()){
			tag = stack.getTagCompound();
		}else{
			tag = new NBTTagCompound();
			stack.setTagCompound(tag);
		}

		return tag;
	}
}
