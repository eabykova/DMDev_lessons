package DMDevCourse.Lesson7;

public abstract class Enemy implements Mortal, Fightable {
	private int health;
	private String name;
	private int damagePossibility;

	public Enemy(String name, int health, int damagePossibility) {
		this.name = name;
		this.health = health;
		this.damagePossibility = damagePossibility;
	}

	public abstract void attackHero(Hero hero);
	public abstract boolean isAlive();
	public abstract void takeDamage(int damagePossibility);
	public abstract void sayStage();

	public int getDamagePossibility() {
		return damagePossibility;
	}

	public int getHealth() {
		return health;

	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

}
