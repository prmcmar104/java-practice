package inheritance_example.without_inheritance;

/**
 * Created by Jay Vaghani
 */
public class Employee  {

    private String name;
    private int age;
    private double salary;
    private String organisation;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public double getSalary() { return salary; }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getOrganisation() { return organisation; }

    public void setOrganisation(String organisation)
    {
        this.organisation = organisation;
    }

    public String toString()
    {
        return String.format(
                "Employee :- name : %s , age : %d , organisation : %s , salary : %f",
                name, age, organisation, salary);
    }
}
