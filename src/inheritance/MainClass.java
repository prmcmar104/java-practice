package inheritance;

public class MainClass extends ChildClass{

    public MainClass(int a){
        super(a);
    }


    public void m5(){
        System.out.println("This is main calss method");
    }

    public static void main(String[] args) {
        MainClass obj = new MainClass(20);
        obj.m5();
        obj.m3();
        obj.m4();
        obj.m1();
        obj.m2();
    }



}
