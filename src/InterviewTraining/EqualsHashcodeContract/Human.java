package InterviewTraining.EqualsHashcodeContract;

import java.util.Objects;

public class Human {
    private String Name;
    private int id;
    private int cash;

    public Human(String name, int id, int cash) {
        Name = name;
        this.id = id;
        this.cash = cash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return id == human.id && cash == human.cash && Objects.equals(Name, human.Name);
    }

    @Override
    public int hashCode() {
        return id * cash * 39;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Name='" + Name + '\'' +
                ", id=" + id +
                ", cash=" + cash +
                '}';
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }

    public int getCash() {
        return cash;
    }
}
