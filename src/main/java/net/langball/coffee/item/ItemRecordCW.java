package net.langball.coffee.item;

import java.util.List;

import net.langball.coffee.CoffeeWork;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class ItemRecordCW extends ItemRecord {

	protected ItemRecordCW(String name) {
		super(name.substring(8),new SoundEvent(new ResourceLocation(CoffeeWork.MODID,name)));
		setUnlocalizedName(CoffeeWork.MODID+'.'+name.replace('.', '_'));
	}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add(I18n.format("word.thanks2lanxi.name", new Object()));
	}
}
