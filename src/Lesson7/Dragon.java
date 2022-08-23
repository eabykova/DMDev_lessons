package Lesson7;

public class Dragon extends Enemy {
	public Dragon(String name, int health, int damagePossibility) {
		super(name, health, damagePossibility);
	}

	@Override
	public boolean isAlive() {
		return super.getHealth() > 0;
	}

	@Override
	public void attackHero(Hero hero) {
		System.out.println("Dragon " + getName() + " fries Hero " + hero.getName());
		hero.takeDamage(super.getDamagePossibility());
	}

	@Override
	public void takeDamage(int damagePossibility) {
		super.setHealth(super.getHealth() - damagePossibility);
	}

	@Override
	public void sayStage() {
		System.out.println("Dragon " + getName() + " health is: " + getHealth());

	}


}
