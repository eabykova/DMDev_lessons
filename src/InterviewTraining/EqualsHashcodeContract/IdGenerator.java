package InterviewTraining.EqualsHashcodeContract;

public class IdGenerator {
    private static IdGenerator idGenerator;
    private int id;

    IdGenerator() {
        this.id = 1;
    }

    public static IdGenerator getIdGenerator() {
        if (idGenerator == null) {
            idGenerator = new IdGenerator();
        }
        return idGenerator;
    }
    public int generateId() {
        return this.id++;
    }
}
