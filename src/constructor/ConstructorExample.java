package constructor;

public class ConstructorExample {
    int empID; //10
    String empName;//Rax

    public ConstructorExample(int empID, String empName){
        this.empID = empID;
        this.empName = empName;
    }
    public static void main(String[] args) {
        ConstructorExample t = new ConstructorExample(10,"Rax");
        t.display();
        ConstructorExample t1 = new ConstructorExample(50, "David");
        t1.display();
    }
    public void display(){
        System.out.println(empID);
        System.out.println(empName);
    }

}
