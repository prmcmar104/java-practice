package morningchallenge;

/**
 * Created by Jay Vaghani
 */

/**
 * Challenge-2.
 *
 * Write a java program using the following
 * requirement.
 * 1.Create a Java class with name 'Challenge2'
 * 2.Create a main method.
 * 3.Declare the Two int type variables with
 *   names 'num1' and 'num2' and assign
 *   value is 'num1'= '10' and
 *   'num2'= '20'
 * 4.Create a method it's take two int type params
 *   and no return the value with name productOfTwoNumber()
 *   Print the product of Two Number like output
 * 5.Call productOfTwoNumber() Method in to main method with
 *   help of Object.
 *
 * Output:
 *   10 X 20 = 200
 */
public class Challenge2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Challenge2 challenge2 = new Challenge2();
        challenge2.productOfTwoNumber(num1, num2);
    }

    public void productOfTwoNumber(int num1, int num2){
        int ans = num1 * num2;
        System.out.println(num1 + " X " + num2 + " = " + ans);
    }
}
