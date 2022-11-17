package InterviewTraining.FinalKey;

public class FinalDemo {
    public static final String finalString = "This String is final";
    //public static final String finalString1; could not work without init!

    public static void main(String[] args) {
        final int finalInt;
        finalInt = 10;
        System.out.println("This int can be init only one's time into the program: finalInt = " + finalInt);

        System.out.println("This int can be changed into the program: finalInt = " + (finalInt + 2));
        //finalInt = 11; one's time only!
    }
}
