package com.example.RPG.Methods;

import com.example.RPG.Entities.Unit;

public class Methods {

		public static void physicalDamageCalculator(Unit attacker, Unit defender) {

			int attack=(int)(((attacker.getWeapon().getWAttack()+attacker.getStrength())*(1+attacker.getAbility()/100))*(Math.random()+attacker.getLuck()/100));

			int defense=(int)(((defender.getArmor().getADefense()+defender.getDefence())*(1+defender.getAbility()/100))*(Math.random()+attacker.getLuck()/100));


			if(Math.random()+(attacker.getCritical()+attacker.getWeapon().getWCritical())/100>1){

				attack=attack*3;
			}

			int damage=attack-defense;

			if(damage<0){
				damage=0;
			}

			defender.setHp(defender.getHp()-damage);

			if(defender.getHp()<=0){

				defender.defeated();
			}
		}

	public static void magicalDamageCalculator(Unit attacker, Unit defender) {

		int attack=(int)(((attacker.getWeapon().getWIntelligence()+attacker.getIntelligence())*(1+attacker.getAbility()/100))*(Math.random()+attacker.getLuck()/100));

		int defense=(int)(((defender.getArmor().getAResistance()+defender.getResistance())*(1+defender.getAbility()/100))*(Math.random()+attacker.getLuck()/100));

		if(Math.random()+(attacker.getCritical()+attacker.getWeapon().getWCritical())/100>1){

			attack=attack*3;
		}

		int damage=attack-defense;

		if(damage<0){
			damage=0;
		}

		defender.setHp(defender.getHp()-damage);

		if(defender.getHp()<=0){

			defender.defeated();
		}
	}
	}


