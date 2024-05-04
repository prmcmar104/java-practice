package polymorphism.runtime;

public class ChildClass extends ParentClass{

    public void calculation(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
    }

    private void addition(int a, int b){
        System.out.println(a+b);
    }

    public static void staticExample(){
        System.out.println("Child class static method");
    }

}
