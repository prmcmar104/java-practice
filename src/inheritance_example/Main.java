package inheritance_example;

/**
 * Created by Jay Vaghani
 */
public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(101, "Prime", 50000, "Testing");
        System.out.println(employee.geteId());
        System.out.println(employee.getSalary());
        System.out.println(employee.getOrganization());
        System.out.println(employee.geteName());

    }
}
