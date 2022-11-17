package InterviewTraining.EqualsHashcodeContract;

public class HumanDemo {
    public static void main(String[] args) {
        IdGenerator idGenerator = new IdGenerator();

        Human bill = new Human("Bill", idGenerator.generateId(), 2);
        Human tom = new Human("Tom", idGenerator.generateId(), 1);

        System.out.println(tom.hashCode() == bill.hashCode());
        System.out.println(tom.equals(bill));
        System.out.println(bill.toString());
        System.out.println(tom.toString());
    }

}
