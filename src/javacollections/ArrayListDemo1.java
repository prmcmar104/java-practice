package javacollections;

import java.util.ArrayList;

public class ArrayListDemo1 {



    public static void main(String[] args) {
        ArrayList <Object> list = new ArrayList();
        list.add("Java");
        list.add("Python");
        list.add(50);
        list.add(true);
        list.add('H');

        System.out.println(list);

        for (Object name  : list ){
            System.out.print(name+ ",");
        }

        System.out.println();
        ArrayList <Integer> numberList = new ArrayList();
        numberList.add(10);
        numberList.add(20);
        System.out.println(numberList.get(0));
    }

}
