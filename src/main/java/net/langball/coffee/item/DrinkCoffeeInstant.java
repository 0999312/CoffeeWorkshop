package net.langball.coffee.item;

import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.effect.PotionLoader;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
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
	public DrinkCoffeeInstant(int amount, float saturation,boolean cup) {
		super(amount, saturation,null);
		cup_instant=cup;
		this.setAlwaysEdible();
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
	        }
		 ItemStack itemcup = ItemStack.EMPTY;
		 if(!cup_instant) itemcup = new ItemStack(DrinksLoader.cup);
		 return itemcup;
	    }
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		PotionEffect bitter_1 = new PotionEffect(PotionLoader.relax,300,0);
		player.addPotionEffect(bitter_1);
		PotionEffect bitter_2 = new PotionEffect(Potion.getPotionById(11),200,0);
		player.addPotionEffect(bitter_2);
		PotionEffect bitter_3 = new PotionEffect(Potion.getPotionById(1),200,0);
		player.addPotionEffect(bitter_3);
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
