package net.langball.coffee.item;

import net.langball.coffee.effect.PotionLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemDessert extends ItemFood {

	public ItemDessert(int amount, float saturation, boolean isWolfFood) {
		super(amount,saturation, isWolfFood);
	}
	public ItemDessert(int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
	}
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if(!worldIn.isRemote){
		PotionEffect effect= player.getActivePotionEffect(PotionLoader.relax);
		if(effect != null){
			int foodlevel = effect.getAmplifier();
			player.heal(foodlevel*2);
			player.getFoodStats().addStats(foodlevel, foodlevel*1.25F);
		}
		}
		super.onFoodEaten(stack, worldIn, player);
	}
}
