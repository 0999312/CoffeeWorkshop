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
import net.minecraft.util.text.TextComponentTranslation;
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
	        player.sendMessage(new TextComponentTranslation("coffee.rusult.one.name",new Object[0]));
			player.addPotionEffect(bitter_1);
			player.addPotionEffect(bitter_2);
			player.addPotionEffect(bitter_3);
			break;
		case 1:
			player.sendMessage(new TextComponentTranslation("coffee.rusult.two.name",new Object[0]));
			player.addPotionEffect(bitter_1);
			player.addPotionEffect(bitter_2); 
			break;
		case 2:
			player.sendMessage(new TextComponentTranslation("coffee.rusult.three.name",new Object[0]));
			player.addPotionEffect(bitter_1);
			break;
		case 3:
			player.sendMessage(new TextComponentTranslation("coffee.rusult.four.name",new Object[0]));
			player.addPotionEffect(bad_2);
			player.addPotionEffect(bad_3);
			break;
		case 4:
			player.sendMessage(new TextComponentTranslation("coffee.rusult.five.name",new Object[0]));
			player.addPotionEffect(bad_1);
			player.addPotionEffect(bad_2);
			player.addPotionEffect(bad_3);
			break;
		 default:
			player.sendMessage(new TextComponentTranslation("coffee.rusult.null.name",new Object[0]));
//			System.out.println(ranresult);
			break;
	}
	}
	}
}
