package Lesson7;

public class TrainingGround {
	public static void main(String[] args) {
		Archer archer = new Archer("Meggi", 160, 10);
		Mage mage = new Mage("Baba Yaga", 330, 150);
		Warrior warrior = new Warrior("Artur the King", 190, 70);
		Zombie zombie = new Zombie("Chupacabra", 120, 50);
		Demon demon = new Demon("Barlog", 370, 90);
		Dragon dragon = new Dragon("Veyzerys", 200, 60);

		System.out.println("Heroes make complex attack to Enemy " + zombie.getName());
		makeAttack(zombie, archer, warrior, mage, warrior, mage);
		zombie.sayStage();
		System.out.println();

		System.out.println("Hero " + zombie.getName() + " rises from Hell: ");
		zombie.isResurrected();
		zombie.sayStage();
		System.out.println();

		System.out.println("Attacked by Dragon " + dragon.getName() + " Archer " + archer.getName() + " is healing by Mage " + mage.getName() + ":");
		dragon.attackHero(archer);
		archer.sayStage();
		mage.heal(archer);
		archer.sayStage();
		System.out.println();

		System.out.println("And now all Heroes try to make damage to Demon " + demon.getName() + ":");
		makeAttack(demon, archer, warrior, mage);
		demon.sayStage();
	}
	public static void makeAttack(Enemy enemy, Hero... heroes) {
		for (Hero hero : heroes) {
			hero.attackEnemy(enemy);
		}
	}
}
