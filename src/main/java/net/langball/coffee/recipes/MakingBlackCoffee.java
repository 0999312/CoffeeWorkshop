package net.langball.coffee.recipes;

import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.item.DrinkCoffee;
import net.langball.coffee.item.ItemLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class MakingBlackCoffee extends ShapelessOreRecipe {

	public MakingBlackCoffee() {
		super(new ResourceLocation(" "), DrinksLoader.coffee, new  Object[]{
				new ItemStack(ItemLoader.coffee_pot,1,3),DrinksLoader.cup
		});
		
	}
	@SubscribeEvent
	public void onCrafting(PlayerEvent.ItemCraftedEvent event){
        EntityPlayer player = event.player;
        ItemStack item = event.crafting;
		IInventory craftMatrix = event.craftMatrix;

		if(!item.isEmpty()){
	        if(item.getItem() ==DrinksLoader.coffee){
	        	ItemStack top = new ItemStack(ItemLoader.coffee_pot,1,0);
	        	ItemStack bottom = new ItemStack(ItemLoader.coffee_pot,1,1);
	    		player.inventory.addItemStackToInventory(top);
	    		player.inventory.addItemStackToInventory(bottom);
	        }
		}

	}
}
