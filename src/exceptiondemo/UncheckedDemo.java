package exceptiondemo;

public class UncheckedDemo {

    public static void division(){
        int a = 10;
        int b = 2;

       try {
           System.out.println(a/b);
       }catch (Exception e){
           System.out.println(e.getMessage());
           System.out.println("Pls enter valid number");
       }

        System.out.println("Hello");

    }

    public static void main(String[] args) {
        division();
    }
}
