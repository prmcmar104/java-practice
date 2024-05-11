package encapsulation;

public class Test {

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setId(10);
        System.out.println(obj.getId());
        obj.setId(50);
        System.out.println(obj.getId());

        obj.setName("Prime");
        System.out.println(obj.getName());
    }

}
