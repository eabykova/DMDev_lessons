package DMDevCourse.Lesson7;

public abstract class Hero<T> implements Fightable {
	private String name;
	private int damagePossibility;
	private int health;
	private T weapon;

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

	public T getWeapon() {
		return weapon;
	}

	public void setWeapon(T weapon) {
		this.weapon = weapon;
	}
}
