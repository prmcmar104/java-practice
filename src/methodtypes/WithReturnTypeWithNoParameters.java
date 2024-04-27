package methodtypes;

public class WithReturnTypeWithNoParameters{

    public static void main(String[] args) {
        int  result = addition();
        System.out.println(result);
        WithReturnTypeWithNoParameters obj = new WithReturnTypeWithNoParameters();
        String name = obj.myName();
        System.out.println(name);
        // direct method calling in print statement
        System.out.println(obj.myName());
        System.out.println(isRight());
    }
    /**
     * This is with return with no params method
     * @return - it returns int type data - e.g. - ans
     */
    public static int addition(){
        int a = 10;
        int b = 20;
        int ans = a +b;
        return ans;
    }
    public String myName(){
        String firstName = "Amit";
        String lastName = "Kathrotiya";
        return firstName+ " "+lastName;
    }

    public static boolean isRight(){
        boolean a = true;
        boolean b = false;
        String course = "Java";
        return b;
    }

}
