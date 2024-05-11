package exceptiondemo;

public class ThrowExample {

    public static  void checkAge(int age){
        if (age < 18){
          throw new ArithmeticException("Access denied");
        }else {
            System.out.println("Access granted");
        }

        System.out.println("Hello");

    }

    public static void main(String[] args) {
        checkAge(19);
    }

}
