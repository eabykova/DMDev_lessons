package Lesson7;

import Lesson9.Weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> implements Mortal, Healable {
	public Mage(String name,int health, int damagePossibility) {
		super(name, health, damagePossibility);
	}

	public void attackEnemy(Enemy enemy) {
		System.out.println("Mage " + getName() + " sends a curse on Enemy " + enemy.getName());
		enemy.takeDamage(super.getDamagePossibility());
	}

	@Override
	public void takeDamage(int damagePossibility) {
		super.setHealth(super.getHealth() - damagePossibility);
	}

	@Override
	public void sayStage() {
		System.out.println("Mage " + getName() + " health is: " + getHealth());

	}

	@Override
	public boolean isAlive() {
		return super.getHealth() > 0;
	}

	@Override
	public void heal(Hero hero) {
		System.out.println("Mage " + getName() + " heals Hero " + hero.getName());
		hero.setHealth(hero.getHealth() + 50);
	}
}
