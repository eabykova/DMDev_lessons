package Lesson11;

public class PersonExample {
	public static void main(String[] args) {
		Person person = new Person(1, "Jim", "Jackson");
		Person person1 = new Person(1, "Jim", "Jackson");
//		Person person1 = new Person(2, "Paul", "Colins");

		System.out.println("HC1 " + person.hashCode());
		System.out.println("HC2 " + person1.hashCode());
		System.out.println("Equals " + person.equals(person1));


	}
}
