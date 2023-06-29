package com.example.RPG.Methods;

import com.example.RPG.Entities.Unit;

public class Methods {

		public static void physicalDamageCalculator(Unit attacker, Unit defender) {

			int physicalAttack=(int)(((attacker.getWeapon().getWAttack()+attacker.getStrength())*(1+attacker.getAbility()/100))*(Math.random()+attacker.getLuck()/100));
			int physicalDefense=(int)(((defender.getArmor().getADefense()+defender.getDefence())*(1+defender.getAbility()/100))*(Math.random()+attacker.getLuck()/100));


			if(isCritical(attacker)){
				physicalAttack=physicalAttack*3;
			}
			int damage=physicalAttack-physicalDefense;
			if(damage<0){
				damage=0;
			}
			defender.setHp(defender.getHp()-damage);
			if(defender.getHp()<=0){
				defender.defeated();
			}
		}

	public static void magicalDamageCalculator(Unit attacker, Unit defender) {

		int magicAttack=(int)(((attacker.getWeapon().getWIntelligence()+attacker.getIntelligence())*(1+attacker.getAbility()/100))*(Math.random()+attacker.getLuck()/100));
		int magicDefense=(int)(((defender.getArmor().getAResistance()+defender.getResistance())*(1+defender.getAbility()/100))*(Math.random()+attacker.getLuck()/100));

		if(isCritical(attacker)){
			magicAttack=magicAttack*3;
		}
		int damage=magicAttack-magicDefense;
		if(damage<0){
			damage=0;
		}
		defender.setHp(defender.getHp()-damage);
		if(defender.getHp()<=0){
			defender.defeated();
		}
	}

	private static boolean isCritical(Unit attacker) {
		return (int) (Math.random() + (attacker.getCritical() + attacker.getWeapon().getWCritical()) / 100) > 1;}
	}


