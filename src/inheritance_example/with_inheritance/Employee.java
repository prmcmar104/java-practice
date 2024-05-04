package inheritance_example.with_inheritance;

/**
 * Created by Jay Vaghani
 */
/*Employee class is inheriting the properties of Person
class( through extend keyword) Therefore, we don't need to
declare name and age (and their related methods which are
covered in Person) again.*/
public class Employee extends Person {

    private double salary;
    private String organisation;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String toString() {
        return String.format(
                "Employee :- name : %s , age : %d , organisation : %s , salary : %f",
                getName(), getAge(), getOrganisation(),
                getSalary());
    }
}
