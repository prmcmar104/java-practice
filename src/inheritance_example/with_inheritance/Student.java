package inheritance_example.with_inheritance;

/**
 * Created by Jay Vaghani
 */

/*Student class is inheriting the properties of Person
class( through extend keyword) Therefore, we don't need to
declare name and age (and their related methods which are
covered in Person) again.*/
public class Student extends Person {

    private int rollno;
    private String school;

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
                getName(), getAge(), getRollno(), getSchool());
    }
}
