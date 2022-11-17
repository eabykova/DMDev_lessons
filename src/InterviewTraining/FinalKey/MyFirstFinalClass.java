package InterviewTraining.FinalKey;

import java.util.HashMap;
import java.util.Iterator;

public class MyFirstFinalClass {
    private final String name;
    private final int age;
    private final HashMap<String, String> addresses;

    public MyFirstFinalClass(String name, int age, HashMap<String, String> addresses) {
        this.name = name;
        this.age = age;
        HashMap<String, String> tmp = new HashMap<>();
        String key;
        Iterator<String> iterator = addresses.keySet().iterator();
        while (iterator.hasNext()) {
            key = iterator.next();
            tmp.put(key, addresses.get(key));
        }
        this.addresses = tmp;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
