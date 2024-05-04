package inheritance_example;

/**
 * Created by Jay Vaghani
 */
public class Employee extends EmpBase{

    int salary;
    String organization;

    public Employee(int eId, String eName, int salary, String organization) {
        super(eId, eName);
        this.salary = salary;
        this.organization = organization;
    }


    public int getSalary(){
        return salary;
    }

    public String getOrganization(){
        return organization;
    }
}
