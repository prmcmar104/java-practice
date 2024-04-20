package variables;

public class Variables {

   int b = 100;
    String programme = "Java";

    public static void main(String[] args) {
        //Variables declaration
        // int x;
        // int y;
        // int z;
        int x,y,z;
        x = 10;
        y = 20;
        z = 30;
        int a = 10;
        String name = "Prime Testing";
        System.out.println(x+y+z);
        System.out.println(name);
        //create object
        Variables obj = new Variables();
        System.out.println(obj.b);
        System.out.println(obj.programme);


    }


}
