package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Put the string here:");
		int n = 3;
		String str = scan.nextLine();
		String [] res = split(str, n);
		System.out.println(Arrays.toString(res));
	}
	public static String[] split(String src, int n) {
		int arraySize = (int)Math.ceil(src.length() / (double)n);
		String[] res = new String[arraySize];
		int count = 0;
		for (int i = 0; i < src.length(); i += n) {
			int endIndex = Math.min(src.length(), i + n);
			String subStr = src.substring(i, endIndex);
			res[count] = subStr;
			count++;
		}
		return res;
	}
}
