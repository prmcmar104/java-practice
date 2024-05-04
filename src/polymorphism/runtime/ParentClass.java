package polymorphism.runtime;

public class ParentClass {

    public void calculation(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
    }

    private void addition(int a, int b){
        System.out.println(a+b);
    }

    public static void staticExample(){
        System.out.println("Parent class static method");
    }



}
