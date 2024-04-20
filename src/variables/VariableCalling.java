package variables;

public class VariableCalling {

    String name = "Prime"; // Instance variable
    static int number = 100; // Static variable

    public static void main(String[] args) {
        VariableCalling t = new VariableCalling();
        System.out.println(t.name);
        System.out.println(number);
        System.out.println(VariableCalling.number);
        System.out.println("---------------------------");
        t.m1();//method calling
    }
    //m1 is non static method(Instance method)
    protected void m1(){
        VariableCalling obj = new VariableCalling();
        System.out.println(obj.name);
        System.out.println(name);
        System.out.println(VariableCalling.number);
        System.out.println(number);

    }


}
