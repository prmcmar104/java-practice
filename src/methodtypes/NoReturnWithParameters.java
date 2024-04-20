package methodtypes;

public class NoReturnWithParameters {

    //No return type with parameters
    public static void addition(int a, int b) {
        int answer = a + b;
        System.out.println(answer);
    }

    public static void printName(String name){
        System.out.println("Name is "+name);
    }

    public static void main(String[] args) {
        addition(10, 20);
        addition(5,5);
        printName("Prime");
        printName("Amit");
    }



}
