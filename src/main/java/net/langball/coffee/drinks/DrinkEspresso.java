package net.langball.coffee.drinks;

import net.langball.coffee.block.BlockLoader;
import net.langball.coffee.effect.PotionLoader;
import net.minecraft.advancements.CriteriaTriggers;
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
public class DrinkEspresso extends DrinkCoffee {
	public DrinkEspresso() {
		super("espresso", 1, 1,0.1f, new PotionEffect[]{
				new PotionEffect(PotionLoader.relax,1200,1),
				new PotionEffect(Potion.getPotionById(11),1200,2),
				new PotionEffect(Potion.getPotionById(26),1200,2)
		});
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
	        stack.shrink(1);
	        return stack;
	    }
//	@Override
//	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
//		super.onFoodEaten(stack, worldIn, player);
//		PotionEffect bitter_1 = new PotionEffect(PotionLoader.relax,1200,1);
//		player.addPotionEffect(bitter_1);
//		PotionEffect bitter_2 = new PotionEffect(Potion.getPotionById(11),1200,2);
//		player.addPotionEffect(bitter_2);
//		PotionEffect bitter_3 = new PotionEffect(Potion.getPotionById(26),1200,2);
//		player.addPotionEffect(bitter_3);
//	}
	  @Method(modid="toughasnails")
	  public int getThirst()
	  {
	    return 6;
	  }
	  
	  @Method(modid="toughasnails")
	  public float getHydration()
	  {
	    return 0.4F;
	  }
	  
	  @Method(modid="toughasnails")
	  public float getPoisonChance()
	  {
	    return 0.0F;
	  }
}
