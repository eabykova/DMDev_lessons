package Lesson7;

public abstract class Hero implements Fightable {
	private String name;
	private int damagePossibility;
	private int health;

	public Hero(String name, int health, int damagePossibility) {
		this.name = name;
		this.health = health;
		this.damagePossibility = damagePossibility;
	}

	public abstract void attackEnemy(Enemy enemy);
	public abstract void takeDamage(int damagePossibility);
	public abstract void sayStage();

	public int getDamagePossibility() {
		return damagePossibility;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public String getName() {
		return name;
	}
}
