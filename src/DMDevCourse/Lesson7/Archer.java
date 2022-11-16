package DMDevCourse.Lesson7;

import DMDevCourse.Lesson9.Weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> implements Mortal {
	public Archer(String name, int health, int damagePossibility) {
		super(name, health, damagePossibility);
	}

	public void attackEnemy(Enemy enemy) {
		System.out.println("Archer " + getName() + " shoots a bow at Enemy " + enemy.getName());
		enemy.takeDamage(super.getDamagePossibility());
	}

	@Override
	public void takeDamage(int damagePossibility) {
		super.setHealth(super.getHealth() - damagePossibility);
	}

	@Override
	public void sayStage() {
		System.out.println("Archer " + getName() + " health is: " + getHealth());

	}

	@Override
	public boolean isAlive() {
		return super.getHealth() > 0;
	}
}
