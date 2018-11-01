package net.langball.coffee.item;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.drinks.DrinksLoader;
import net.langball.coffee.drinks.EnumCoffee;
import net.langball.coffee.effect.PotionLoader;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
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
@Interface(iface="toughasnails.api.thirst.IDrink", modid="toughasnails")
public class DrinkMixCoffeeIce extends DrinkCoffee {
	public PotionEffect effect;
	public String name;
	public DrinkMixCoffeeIce(EnumCoffee kind) {
		super(kind.getAmount(), kind.getSaturation(),kind.getEffect());
		effect=kind.getEffect();
		name=kind.getName();
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
		super.onFoodEaten(stack, worldIn, player);
		PotionEffect effect1= player.getActivePotionEffect(PotionLoader.relax);
		if(effect1 != null){
			int plus = effect1.getAmplifier();
			if(plus<=2)
			plus++;
			PotionEffect bitter_1 = new PotionEffect(PotionLoader.relax,600,plus);
			player.addPotionEffect(bitter_1);
		}else{
		PotionEffect bitter_1 = new PotionEffect(PotionLoader.relax,600,0);
		player.addPotionEffect(bitter_1);
		}
		PotionEffect bitter_2 = new PotionEffect(Potion.getPotionById(11),600,2);
		player.addPotionEffect(bitter_2);
		PotionEffect bitter_3 = new PotionEffect(Potion.getPotionById(26),600,2);
		player.addPotionEffect(bitter_3);
		if(effect!=null){
		player.addPotionEffect(effect);
		}
	}
	  @Method(modid="toughasnails")
	  public int getThirst()
	  {
	    return 10;
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
}
