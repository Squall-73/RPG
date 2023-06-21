package com.example.RPG.Entities;

import lombok.Data;

@Data
public class Unit {

	private long id;
	private String name;
	private	Weapon weapon;
	private Armor armor;
	private Accessory accessory;
	private int hp;
	private int mp;
	private int strength;
	private int intelligence;
	private int ability;
	private int speed;
	private int luck;
	private int defence;
	private int resistance;
	private int critical;
	private boolean alive;

	public void defeated(){

		setAlive(false);
	}


}
