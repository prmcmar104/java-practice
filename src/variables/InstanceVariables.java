package variables;

public class InstanceVariables {
    /**
     * Instance - object
     * Scope    - within the class
     * Memory allocated - when object is created
     * memory - heap
     */

    int a = 10; // a is a Instance variable or Global variable
    String name = "Prime Testing"; //name is a Instance variable or Global variable

    public static void main(String[] args) {
       InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
        System.out.println(obj.name);
    }

    public void myMethod(){
        System.out.println(a);
        InstanceVariables instanceVariables = new InstanceVariables();
        System.out.println(instanceVariables.name);
    }

}
