package DMDevCourse.Lesson9;

import DMDevCourse.Lesson7.Archer;
import DMDevCourse.Lesson7.Hero;
import DMDevCourse.Lesson7.Warrior;
import DMDevCourse.Lesson9.Weapon.Bow;
import DMDevCourse.Lesson9.Weapon.Sword;
import DMDevCourse.Lesson9.Weapon.Weapon;

public class WeaponRunner {
	public static void main(String[] args) {
		Archer<Bow> bowArcher = new Archer<>("Legolas", 200, 20);
		bowArcher.setWeapon(new Bow());
		Warrior<Sword> warrior = new Warrior<>("Aragorn", 290, 25);
		warrior.setWeapon(new Sword());

		printWeaponDamage(bowArcher);
	}
	public static <T extends Weapon> void printWeaponDamage(Hero<T> hero) {
		System.out.println(hero.getWeapon().getDamage());
	}
}
