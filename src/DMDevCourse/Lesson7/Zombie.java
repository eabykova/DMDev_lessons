package DMDevCourse.Lesson7;

public class Zombie extends Enemy {
	public Zombie(String name, int health, int damagePossibility) {
		super(name, health, damagePossibility);
	}

	public boolean isAlive() {
		return super.getHealth() > 0;
	}

	@Override
	public void attackHero(Hero hero) {
		System.out.println("Zombie " + getName() + " try to eat Hero " + hero.getName() + "'s brains");
		hero.takeDamage(super.getDamagePossibility());
	}

	@Override
	public void takeDamage(int damagePossibility) {
		super.setHealth(super.getHealth() - damagePossibility);
		if (super.getHealth() < 0)
			super.setHealth(0);
	}

	@Override
	public void sayStage() {
		System.out.println("Zombie " + getName() + " health is: " + getHealth());
	}

	public void isResurrected() {
		if (super.getHealth() < 1)
			super.setHealth(120);
	}
}
