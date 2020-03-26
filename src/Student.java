import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private String surname;
    private boolean sex;
    private byte group;

    public Student(String name, String surname, boolean sex, byte group) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public boolean getSex() {
        return sex;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public String toString() {
        String gender =  sex ? "man" : "woman";
        int group = 900+this.group;
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group=" + group +
                ", gender='" + gender + '\'' +
                '}';
    }
}
