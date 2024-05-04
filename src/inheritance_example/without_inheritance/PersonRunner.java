package inheritance_example.without_inheritance;

/**
 * Created by Jay Vaghani
 */
public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();

        person.setName("Saurabh");
        person.setAge(20);

        student.setName("Prateek");
        student.setAge(21);
        student.setRollno(101);
        student.setSchool("New Era HS");

        employee.setName("Sushant");
        employee.setAge(25);
        employee.setOrganisation("GeeksforGeeks");
        employee.setSalary(50000.00);

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
    }
}
