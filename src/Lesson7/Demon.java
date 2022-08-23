package Lesson7;

public class Demon extends Enemy {
	public Demon(String name, int health, int damagePossibility) {
		super(name, health, damagePossibility);
	}
	public void sayStage() {
		System.out.println("Demon " + getName() + " health is: " + getHealth());
	}
	@Override
	public boolean isAlive() {
		return super.getHealth() > 0;
	}

	@Override
	public void attackHero(Hero hero) {
		System.out.println("Demon " + getName() + " strikes with a fiery whip Hero " + hero.getName());
		hero.takeDamage(super.getDamagePossibility());
	}

	@Override
	public void takeDamage(int damagePossibility) {
		super.setHealth(super.getHealth() - damagePossibility);
	}
}
