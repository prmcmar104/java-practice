package methodtypes;

public class WithReturnTypeWithParameters {

    public static int addition(int a, int b){
        int result = a + b;
        return  result;
    }

    public static String name(String courseName){
        return courseName;
    }

    public static void main(String[] args) {
        int  ans =  addition(10,20);
        System.out.println(ans);
        System.out.println(addition(15,10));//25
        System.out.println(addition(20,30));
        System.out.println(addition(50,50));
        String courseName1 = name("Java");
        System.out.println(courseName1);
        System.out.println(name("Python"));


    }

}
