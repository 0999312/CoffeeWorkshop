package net.langball.coffee.drinks;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public enum EnumCoffee {
	american("american",3,1f,null),
	latte("latte",4,2f,new PotionEffect(Potion.getPotionById(10),500,1)),
	cappuccino("cappuccino",4,2f,new PotionEffect(Potion.getPotionById(10),600,2)),
	macchiato("macchiato",5,2f,new PotionEffect(Potion.getPotionById(3),600,2)),
	mochaccino("mochaccino",5,2f,new PotionEffect(Potion.getPotionById(5),600,1)),
	vanilla("vanilla",4,4f,new PotionEffect(Potion.getPotionById(10),500,2)),
	berry("berry",4,4f,new PotionEffect(Potion.getPotionById(10),500,2)),
	lemon("lemon",5,2f,new PotionEffect(Potion.getPotionById(8),500,2)),

	freddo("freddo",4,2f,new PotionEffect(Potion.getPotionById(11),600,2)),
	freddo_mocha("freddo_mocha",6,2f,new PotionEffect(Potion.getPotionById(11),700,2)),
	freddo_caramel("freddo_caramel",6,2f,new PotionEffect(Potion.getPotionById(11),700,2))
	
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
