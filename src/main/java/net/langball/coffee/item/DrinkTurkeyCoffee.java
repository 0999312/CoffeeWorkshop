package net.langball.coffee.item;

import java.util.Random;

import net.langball.coffee.drinks.DrinksLoader;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class DrinkTurkeyCoffee extends DrinkCoffee {

	public DrinkTurkeyCoffee() {
		super(2,2f,null);
		
	}
	
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		
		PotionEffect bitter_1 = new PotionEffect(Potion.getPotionById(1),500,2);
		PotionEffect bitter_2 = new PotionEffect(Potion.getPotionById(11),500,2);
		PotionEffect bitter_3 = new PotionEffect(Potion.getPotionById(26),500,2);
		PotionEffect bad_1 = new PotionEffect(Potion.getPotionById(19),500,2);
		PotionEffect bad_2 = new PotionEffect(Potion.getPotionById(17),500,2);
		PotionEffect bad_3 = new PotionEffect(Potion.getPotionById(9),500,2);
		if(!worldIn.isRemote){
		Random ran = new Random();
		int ranresult = ran.nextInt(5);
		switch (ranresult){
		case 0:
	        player.sendStatusMessage(new TextComponentString(I18n.format("coffee.rusult.1",new Object())), true);
			player.addPotionEffect(bitter_1);
			player.addPotionEffect(bitter_2);
			player.addPotionEffect(bitter_3);
			break;
		case 1:
			player.sendStatusMessage(new TextComponentString(I18n.format("coffee.rusult.2",new Object())), true);
			player.addPotionEffect(bitter_1);
			player.addPotionEffect(bitter_2); 
			break;
		case 2:
			player.sendStatusMessage(new TextComponentString(I18n.format("coffee.rusult.3",new Object())), true);
			player.addPotionEffect(bitter_1);
			break;
		case 3:
			player.sendStatusMessage(new TextComponentString(I18n.format("coffee.rusult.4",new Object())), true);
			player.addPotionEffect(bad_2);
			player.addPotionEffect(bad_3);
			break;
		case 4:
			player.sendStatusMessage(new TextComponentString(I18n.format("coffee.rusult.5",new Object())), true);
			player.addPotionEffect(bad_1);
			player.addPotionEffect(bad_2);
			player.addPotionEffect(bad_3);
			break;
		 default:
			player.sendStatusMessage(new TextComponentString(I18n.format("coffee.rusult.null",new Object())), true);
//			System.out.println(ranresult);
			break;
	}
	}
	}
}
