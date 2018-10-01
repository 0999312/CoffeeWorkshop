package net.langball.coffee.drinks;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public enum EnumCoffee {
	american("american",3,1f,null),latte("latte",3,2f,new PotionEffect(Potion.getPotionById(10),600,1)),
	cappuccino("cappuccino",4,2f,new PotionEffect(Potion.getPotionById(10),600,2)),
	macchiato("macchiato",3,2f,new PotionEffect(Potion.getPotionById(3),600,2)),mochaccino("mochaccino",3,2f,new PotionEffect(Potion.getPotionById(5),600,1))
	
	;

	private String name;
	private PotionEffect effect;
	private int amount;
	private float saturation;
	private EnumCoffee(String name,int amount, float saturation,PotionEffect effect){
		this.name=name;
		this.effect= effect;
		this.amount=amount;
		this.saturation=saturation;
	}
	public int getAmount(){
		return amount;
	}
	public float getSaturation(){
		return saturation;
	}
	public String getName(){
		return name;
	}
	public PotionEffect getEffect(){
		return effect;
	}
}
