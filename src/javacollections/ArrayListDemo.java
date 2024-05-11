package javacollections;

import java.util.ArrayList;

public class ArrayListDemo {
    // Array
    int [] a = new int[5];



    public static void main(String[] args) {
        ArrayList <String> carList = new ArrayList();
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Ford");
        carList.add("Toyota");
        carList.add("Toyota");
        carList.add("Audi");
        carList.add(null);
        System.out.println(carList.size());
        System.out.println(carList.get(1));
        System.out.println(carList.contains("Toyota"));

        for (String car  : carList){
            System.out.println(car);
        }

    }

}
