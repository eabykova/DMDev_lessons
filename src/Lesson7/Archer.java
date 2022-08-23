package Lesson7;

public class Archer extends Hero implements Mortal {
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
