package net.langball.coffee.item;

import net.langball.coffee.CoffeeWork;
import net.langball.coffee.effect.PotionLoader;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemFoodBasic extends ItemFood {

	protected String[] subNames;
	protected int[] amount;
	protected float[] saturation;
	public ItemFoodBasic(String name, int stackSize,int[] amounts,float[] saturations, String... subNames) {
		super(amounts[0],saturations[0], false);
		this.setUnlocalizedName(CoffeeWork.MODID+"."+name);
		this.setHasSubtypes(subNames!=null&&subNames.length > 0);
		this.setMaxStackSize(stackSize);
		this.subNames = subNames!=null&&subNames.length > 0?subNames: null;
	}
	
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        if (entityLiving instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
            if(getAmounts()!=null&&getSaturations()!=null)
			{
				for(int i = 0; i < getAmounts().length; i++)
				entityplayer.getFoodStats().addStats(getAmounts()[i], getSaturations()[i]);
			}
           
            worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
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
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if(!worldIn.isRemote){
		PotionEffect effect= player.getActivePotionEffect(PotionLoader.relax);
		if(effect != null){
			int foodlevel = effect.getAmplifier();
			player.heal(foodlevel+4);
			player.getFoodStats().addStats(foodlevel+2, foodlevel*1.25F);
		}
		}
		super.onFoodEaten(stack, worldIn, player);
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) {
		if(this.isInCreativeTab(tab))
			if(getSubNames()!=null)
			{
				for(int i = 0; i < getSubNames().length; i++)
						list.add(new ItemStack(this, 1, i));
			}
			else
				list.add(new ItemStack(this));
	}
	public int[] getAmounts() {
		return amount;
	}
	
	public float[] getSaturations() {
		return saturation;
	}
	
	public String[] getSubNames() {
		return subNames;
	}
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		if(getSubNames()!=null) {
			String subName = stack.getMetadata() < getSubNames().length?"item."+getSubNames()[stack.getMetadata()]: "";
			return subName;
		}
		return this.getUnlocalizedName();
	}
	
}
