package net.langball.coffee.drinks;

import java.util.List;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.effect.PotionLoader;
import net.langball.coffee.util.RecipesUtil;
import net.langball.coffee.util.TagPropertyAccessor.TagPropertyInteger;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Optional.Interface;
import net.minecraftforge.fml.common.Optional.Method;
import toughasnails.api.stat.capability.ITemperature;
import toughasnails.api.stat.capability.IThirst;
import toughasnails.api.temperature.Temperature;
import toughasnails.api.temperature.TemperatureHelper;
import toughasnails.api.thirst.ThirstHelper;

@Interface(iface="toughasnails.api.thirst.IDrink", modid="toughasnails")
public class DrinkCoffee extends ItemFood {
	private final String name;
	private final PotionEffect[] effect;
	private final int max_cup;
	public TagPropertyInteger cup_amount = new TagPropertyInteger("cup_amount");
	public DrinkCoffee(String name,int cups,int amount, float saturation, PotionEffect[]effects) {
		super(amount, saturation, false);
		effect=effects;
		this.name=name;
		this.setUnlocalizedName(CoffeeWork.MODID+"."+name);
		max_cup=cups;
		cup_amount.set(RecipesUtil.getItemTagCompound(getDefaultInstance()), max_cup);
	}
	
	public DrinkCoffee(EnumCoffee coffee) {
		super(coffee.getAmount(), coffee.getSaturation(), false);
		effect=coffee.getEffect();
		this.name=coffee.getName();
		this.setUnlocalizedName(CoffeeWork.MODID+"."+"coffee_"+name);
		max_cup=coffee.getMaxCups();
		cup_amount.set(RecipesUtil.getItemTagCompound(getDefaultInstance()), max_cup);
	}
	
	public PotionEffect[] getEffectList(){
		return effect;
	}

	public int getMaxCup() {
		return max_cup;
	}
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (playerIn.canEat(true)||playerIn.isCreative())
        {
            playerIn.setActiveHand(handIn);
            return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
        }
        else
        {
            return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
        }
    }
	 public EnumAction getItemUseAction(ItemStack stack)
	    {
	        return EnumAction.DRINK;
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
	            if(cups-1 > 0){
	            	cup_amount.set(RecipesUtil.getItemTagCompound(stack), cups--);
	            	return stack;
	            }
	        }
		 return new ItemStack(DrinksLoader.cup);
	    }
	 @Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		 tooltip.add(I18n.format("word."+CoffeeWork.MODID+"."+name+".name", new Object()));
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if(effect!=null&&effect.length>0){
			for(PotionEffect effect1:effect){
				player.addPotionEffect(effect1);
			}
		}
	}
	  @Method(modid="toughasnails")
	  public void drink(EntityLivingBase entity)
	  {
	    EntityPlayer player = (EntityPlayer)entity;
	    IThirst thirst = ThirstHelper.getThirstData(player);
	    
	    thirst.addStats(getThirst(), getHydration());
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
