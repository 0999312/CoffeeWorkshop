package net.langball.coffee.drinks;

import java.util.List;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.effect.PotionLoader;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
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
public class DrinkSodaDrink extends DrinkCoffee {
	public String name;
	public DrinkSodaDrink(int amount, float saturation) {
		super(amount, saturation, null);
		this.setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_"+name+"_ice");
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
		 return new ItemStack(DrinksLoader.cup_glass);
	    }
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
	}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
	}
	  @Method(modid="toughasnails")
	  public int getThirst()
	  {
	    return 12;
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
	    if (temperature.getTemperature().getRawValue() >= 14) temperature.setTemperature(new Temperature(temperature.getTemperature().getRawValue() - 2));
	  }
}
