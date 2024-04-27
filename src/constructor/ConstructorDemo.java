package constructor;

public class ConstructorDemo {

    public ConstructorDemo(){
        System.out.println("Zero args constructor");
    }
    public ConstructorDemo(int a){
        System.out.println("1 args constructor "+a);
    }
    public ConstructorDemo(String name){
        System.out.println("1 args constructor "+name);
    }
    public ConstructorDemo(int a, int b){
        System.out.println("2 args constructor :");
    }
    public void addition(){
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
      // Constructor is called when object is created.
      ConstructorDemo t = new ConstructorDemo();
      ConstructorDemo t1 = new ConstructorDemo(10);
      ConstructorDemo t2 = new ConstructorDemo("Prime");
      ConstructorDemo t3 = new ConstructorDemo(10,20);
      t.addition();

    }

}
