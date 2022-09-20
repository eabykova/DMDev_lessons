package Homework2;

public class Task2 {
	public static void main(String[] args) {

	}
	public static int arabicInt(char romanCh) {
		switch (romanCh) {
			case 'M' :
				return 1000;
			case 'D' :
				return 500;
			case 'C' :
				return 100;
			case 'L' :
				return 50;
			case 'X' :
				return 10;
			case 'V' :
				return 5;
			case 'I' :
				return 1;
			default:
				return 0;
		}
	}
}
