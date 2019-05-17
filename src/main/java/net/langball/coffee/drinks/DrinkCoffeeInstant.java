package net.langball.coffee.drinks;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.util.RecipesUtil;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Optional.Interface;
import net.minecraftforge.fml.common.Optional.Method;
import toughasnails.api.stat.capability.ITemperature;
import toughasnails.api.temperature.Temperature;
import toughasnails.api.temperature.TemperatureHelper;
@Interface(iface="toughasnails.api.thirst.IDrink", modid="toughasnails")
public class DrinkCoffeeInstant extends DrinkCoffee{
	private boolean cup_instant;

	public DrinkCoffeeInstant(String name, int cups, int amount, float saturation, PotionEffect[] effects,boolean cup) {
		super(name, cups, new int[]{amount}, new float[]{saturation},new String[]{CoffeeWork.MODID+"."+name}, new PotionEffect[][]{
			effects
		});
		cup_instant=cup;
	}
	 public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
	    {
		 if (entityLiving instanceof EntityPlayer)
	        {
	            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
	            entityplayer.getFoodStats().addStats(this, stack);
	            worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_VILLAGER_YES, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
	            this.onFoodEaten(stack, worldIn, entityplayer);
	            entityplayer.addStat(StatList.getObjectUseStats(this));
	            if (entityplayer instanceof EntityPlayerMP)
	            {
	                CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP)entityplayer, stack);
	            }

	            int cups = cup_amount.get(RecipesUtil.getItemTagCompound(stack));
	            if(cups <max_cup_amount.get(RecipesUtil.getItemTagCompound(stack))){
	            	cup_amount.add(RecipesUtil.getItemTagCompound(stack), 1);
	       		 System.out.println("cups:"+cup_amount.get(RecipesUtil.getItemTagCompound(stack)));
	            	return stack;
	            }else{
	            	cup_amount.set(RecipesUtil.getItemTagCompound(stack), max_cup_amount.get(RecipesUtil.getItemTagCompound(stack)));
	       		 return cup_instant ? ItemStack.EMPTY: new ItemStack(DrinksLoader.cup);
	            }
	        }
		 System.out.println("?cups:"+cup_amount.get(RecipesUtil.getItemTagCompound(stack)));
		 return cup_instant ? ItemStack.EMPTY: new ItemStack(DrinksLoader.cup);
	    }
	  @Method(modid="toughasnails")
	  public int getThirst()
	  {
	    return 8;
	  }
	  
	  @Method(modid="toughasnails")
	  public float getHydration()
	  {
	    return 0.6F;
	  }
	  
	  @Method(modid="toughasnails")
	  public float getPoisonChance()
	  {
	    return 0.0F;
	  }
	  @Method(modid="toughasnails")
	  public void changeTemperature(EntityLivingBase entity)
	  {
	    EntityPlayer player = (EntityPlayer)entity;
	    ITemperature temperature = TemperatureHelper.getTemperatureData(player);
	    if (temperature.getTemperature().getRawValue() <= 10) {
	      temperature.setTemperature(new Temperature(temperature.getTemperature().getRawValue() + 1));
	    } else if (temperature.getTemperature().getRawValue() >= 14) {
	      temperature.setTemperature(new Temperature(temperature.getTemperature().getRawValue() - 1));
	    }
	  }
}
