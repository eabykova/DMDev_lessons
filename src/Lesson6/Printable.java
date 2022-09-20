package Lesson6;

public interface Printable {
	String SOME_VAL = "Example";

	void print();

	default void printRandom() {

	}
}
