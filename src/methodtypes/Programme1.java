package methodtypes;

public class Programme1 {

    public static int square(int num){
        int result = num * num;
        return result;
    }

    public static void square1(int num){
        int result = num * num;
        System.out.println(result);
    }

    public static void main(String[] args) {
       int squareValue = square(10);
        System.out.println(squareValue);
        square1(10);
    }

}
