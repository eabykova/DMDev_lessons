package DMDevCourse.Lesson8;

import java.util.Arrays;

public class EnumRunner {
	public static void main(String[] args) {
		ProcessorType bit32 = ProcessorType.BIT_32;
		System.out.println(bit32);
		System.out.println(bit32.name());
		System.out.println(bit32.toString());
		System.out.println(ProcessorType.valueOf("BIT_32"));
		System.out.println(Arrays.toString(ProcessorType.values()));
		System.out.println(ProcessorType.BIT_32.ordinal());
		System.out.println(ProcessorType.BIT_64.getName());
		System.out.println(ProcessorType.BIT_32.getDescription());
		System.out.println(ProcessorType.BIT_64.getDescription());
	}
}
