package InterviewTraining.StringsIntern;

public class StringInternDemo {
    public static void main(String[] args) {
        String s1 = "BestJava";
        String s2 = "BestJava";
        String s3 = new String("BestJava");
        String s4 = new String("BestJava").intern();

        System.out.println("Comparison between links of s1 and s2: " + (s1 == s2));
        System.out.println("Comparison between links of s1 and s3: " + (s1 == s3) +
                ":: there are two different objects, s2 made by NEW operator");
        System.out.println("Comparison between links of s1 and s4: " + (s1 == s4) +
                ":: object s4 is the same of s2 because made by using .intern foo");
    }
}
