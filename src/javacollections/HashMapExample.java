package javacollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<Integer, String> mapList = new HashMap();
        mapList.put(1,"BMW");
        mapList.put(2,"Audi");
        mapList.put(3,"BMW");
        mapList.put(4, "Skoda");

//        System.out.println(mapList);
//        mapList.put(5,"Toyota");
//        System.out.println(mapList);
//        System.out.println(mapList.get(2));

        for (Map.Entry<Integer, String> carName  : mapList.entrySet()){
            System.out.println(carName.getKey()+ " "+carName.getValue());
        }

        Iterator<Map.Entry<Integer,String>> carList = mapList.entrySet().iterator();
        while (carList.hasNext()){
            System.out.println(carList.next()+ " ");
        }

    }

}
