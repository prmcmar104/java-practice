package morningchallenge;

/**
 * Created by Jay Vaghani
 */

/**
 * Challenge-3
 *
 * Write a java program using the following requirement.
 * 1.Create a Java class with name 'Challenge3'
 * 2.Declare two int type instance variables with name 'eId' and 'deptNo'
 * 3.Declare two String type instance variables with name 'eName' and 'job'
 * 4.Create a Constructor to assign the values of Variable.
 * 5.Create an instance no return type no parameter method with name 'display' and call all
 *   four variables inside the display method inside the sout statements.
 * 6.Create a class with name 'Main' and declare the main method
 * 7.Create an object with name 'emp1' and call all four variable and assign
 *   the values for each variable and call the display method
 * 8.Create an object with name 'emp2' and call all four variable and assign
 *   the values for each variable and call the display method
 *
 * Output:
 * 101
 * John
 * 10
 * Manual Tester
 * 102
 * Smith
 * 11
 * Automation Tester
 */
public class Challenge3 {
    int eID;
    int deptNo;
    String eName;
    String job;

    public Challenge3(int eID, int deptNo, String eName, String job) {
        this.eID = eID;
        this.deptNo = deptNo;
        this.eName = eName;
        this.job = job;
    }

    public void display(){
        System.out.println(this.eID);
        System.out.println(this.eName);
        System.out.println(this.deptNo);
        System.out.println(this.job);
    }
}
