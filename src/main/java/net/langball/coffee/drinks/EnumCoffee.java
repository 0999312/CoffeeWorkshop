package net.langball.coffee.drinks;

import java.util.List;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public enum EnumCoffee {
	american("american",3,0.2f,null),
	latte("latte",4,0.2f,new PotionEffect(Potion.getPotionById(10),1200,1)),
	cappuccino("cappuccino",4,0.4f,new PotionEffect(Potion.getPotionById(10),1300,2)),
	macchiato("macchiato",5,0.4f,new PotionEffect(Potion.getPotionById(13),1300,2)),
	mochaccino("mochaccino",5,0.4f,new PotionEffect(Potion.getPotionById(5),1300,1)),
	vanilla("vanilla",4,0.3f,new PotionEffect(Potion.getPotionById(10),1200,2)),
	berry("berry",4,0.3f,new PotionEffect(Potion.getPotionById(10),1200,2)),
	lemon("lemon",4,0.3f,new PotionEffect(Potion.getPotionById(8),1200,2)),
	mint("mint",4,0.3f,new PotionEffect(Potion.getPotionById(3),1200,2)),
	soda("soda",5,0.3f,new PotionEffect(Potion.getPotionById(16),1200,1)),
	moncheri("moncheri",4,0.4f,new PotionEffect(Potion.getPotionById(6),10,1)),
	freddo("freddo",4,0.4f,new PotionEffect(Potion.getPotionById(11),1300,2)),
	freddo_mocha("freddo_mocha",6,0.4f,new PotionEffect(Potion.getPotionById(11),1400,2)),
	freddo_caramel("freddo_caramel",6,0.4f,new PotionEffect(Potion.getPotionById(11),1400,2))
	
	;

	private String name;
	private PotionEffect[] effect;
	private int amount;
	private float saturation;
	private int max_cup;
	private EnumCoffee(String name,int amount, float saturation,int cup, PotionEffect[] effect){
		this.name=name;
		this.effect= effect;
		this.amount=amount;
		this.saturation=saturation;
		this.max_cup=cup;
	}
	public int getMaxCups(){
		return max_cup;
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
	public PotionEffect[] getEffect(){
		return effect;
	}
}
