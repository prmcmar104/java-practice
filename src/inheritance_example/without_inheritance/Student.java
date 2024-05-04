package inheritance_example.without_inheritance;

/**
 * Created by Jay Vaghani
 */
public class Student {
    private String name;
    private int age;
    private int rollno;
    private String school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String toString() {
        return String.format(
                "Student :- name : %s , age : %d , roll : %d , school : %s",
                name, age, rollno, school);
    }

}
