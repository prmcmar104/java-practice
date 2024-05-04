package iterationstatements;

public class WhileLoopDemo {

    public static void main(String[] args) {
        int a = 1;
        while (a<=10){
            System.out.println(a);
            a++;
        }
        System.out.println("Outside while loop");

        boolean ans = true;
        while (ans){
            System.out.println("Prime");
            break;
        }
    }

}
