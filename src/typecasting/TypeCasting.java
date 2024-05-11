package typecasting;

public class TypeCasting {
    /**
     *     The process of converting the value of one data type (int, float, double, etc.)
     *     to another data type is known as typecasting.
     *     1. Widening Type Casting 2. Narrowing Type Casting
     */
    public static void main(String[] args) {

    }

    public static void wideningTypeCasting(){
        // create int type variable
        int num = 10;
        System.out.println("The integer value: " + num);

        // convert into double type
        double data = num;
        System.out.println("The double value: " + data);
    }

    public static void narrowingTypeCasting(){
        // create double type variable
        double num = 10.99;
        System.out.println("The double value: " + num);

        // convert into int type
        int data = (int)num;
        System.out.println("The integer value: " + data);
    }
}


