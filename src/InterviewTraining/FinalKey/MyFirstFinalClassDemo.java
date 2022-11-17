package InterviewTraining.FinalKey;

import java.util.HashMap;

public class MyFirstFinalClassDemo {
    public static void main(String[] args) {
        HashMap<String, String> addressBook = new HashMap<>();
        addressBook.put("Moscow", "Vyatskaya");
        addressBook.put("Novosibirsk", "Sovetskaya");
        addressBook.put("Lipetsk", "Tsentralnaya");
        addressBook.put("Rostov", "Beregovaya");
        MyFirstFinalClass finalClass = new MyFirstFinalClass("Class", 23, addressBook);

        System.out.println(finalClass.getName());
        System.out.println(finalClass.getAge());
    }
}
