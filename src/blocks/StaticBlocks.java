package blocks;

public class StaticBlocks {
   static String eName;

    static {
        System.out.println("This is static block");
        eName = "Rajesh";
    }

    public static void main(String[] args) {
        System.out.println("This is main mehtod");
        System.out.println(eName);
    }




}
