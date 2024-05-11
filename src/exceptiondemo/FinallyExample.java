package exceptiondemo;

public class FinallyExample {

    public static void division(int a, int b){

        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Pls enter valid number");
        }finally {
            System.out.println("I am in finally block");
        }

        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        division(10, 0);

    }

}
