package Lesson23;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {
	public static void main(String[] args) {
		Optional<Student> maybeStudent = Stream.of(
				new Student(19, "Bill"),
				new Student(23, "Alex"),
				new Student(20, "Jess"),
				new Student(18, "Robert"),
				new Student(17, "Jill"),
				new Student(22, "Tom"),
				new Student(21, "Harry"),
				new Student(25, "Shelly"),
				new Student(26, "Ann"),
				new Student(30, "Alberto"),
				new Student(30, "Eric"),
				new Student(20, "Karen")
		)
				.parallel()
//				.map(Student::getAge)
				.filter(student -> student.getAge() < 18)
				.reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);
		//если значение, полученное из Optional не равно NULL, то для него можно вызвать большое кол-во методов:
		maybeStudent.ifPresent(System.out::println);//output
		maybeStudent.map(Student::getAge)//преобразование в другой объект
				.filter(age -> age > 20)//фильтрация по значению
				.ifPresent(System.out::println);
	}
}
