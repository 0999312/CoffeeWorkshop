package net.langball.coffee.block;

import net.langball.coffee.effect.PotionLoader;
import net.minecraft.block.BlockCake;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCakeBasic extends BlockCake {
	private int foodamount;
	private float foodsat;
	private ItemStack cake=new ItemStack(Items.CAKE);
	public BlockCakeBasic(int amount,float sat) {
		this.foodamount=amount;
		this.foodsat=sat;
		setHardness(0.5F);
		setSoundType(SoundType.CLOTH);
	}
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (!worldIn.isRemote)
        {
            return this.eatCake(worldIn, pos, state, playerIn);
        }
        else
        {
            ItemStack itemstack = playerIn.getHeldItem(hand);
            return this.eatCake(worldIn, pos, state, playerIn) || itemstack.isEmpty();
        }
    }
    
    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
    	return this.cake;
    }

    public BlockCakeBasic setItem(ItemStack item){
    	this.cake=item;
    	return this;
    }
    
    public BlockCakeBasic setItem(Item item){
    	ItemStack itemstack= new ItemStack(item);
    	this.cake=itemstack;
    	return this;
    }
    
	private boolean eatCake(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player)
    {
        if (!player.canEat(false))
        {
            return false;
        }
        else
        {
            player.addStat(StatList.CAKE_SLICES_EATEN);
            player.getFoodStats().addStats(foodamount, foodsat);
            if(!worldIn.isRemote){
        		PotionEffect effect= player.getActivePotionEffect(PotionLoader.relax);
        		if(effect != null){
        			int foodlevel = effect.getAmplifier();
        			player.heal(foodlevel+2);
        			player.getFoodStats().addStats(foodlevel+1, foodlevel*1.25F);
        		}
        	}
            int i = ((Integer)state.getValue(BITES)).intValue();

            if (i < 6)
            {
                worldIn.setBlockState(pos, state.withProperty(BITES, Integer.valueOf(i + 1)), 3);
            }
            else
            {
                worldIn.setBlockToAir(pos);
            }

            return true;
        }
    }
}
