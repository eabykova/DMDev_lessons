package DMDevCourse.Lesson7;

import DMDevCourse.Lesson9.Weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> implements Mortal {
	public Warrior(String name, int health, int damagePossibility) {
		super(name, health, damagePossibility);
	}

	public void attackEnemy(Enemy enemy) {
		System.out.println("Warrior " + getName() + " strikes with a sword Enemy " + enemy.getName());
		enemy.takeDamage(super.getDamagePossibility());
	}

	@Override
	public void takeDamage(int damagePossibility) {
		super.setHealth(super.getHealth() - damagePossibility);
	}

	@Override
	public void sayStage() {
		System.out.println("Warrior " + getName() + " health is: " + getHealth());

	}

	@Override
	public boolean isAlive() {
		return super.getHealth() > 0;
	}
}
