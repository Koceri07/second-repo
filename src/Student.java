public class Student extends Person {
    private String groupNumber;

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupNumber='" + groupNumber + '\'' +
                '}';
    }
}
