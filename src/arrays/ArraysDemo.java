package arrays;

public class ArraysDemo {

//    int a = 10;
//    int b = 20;
//    int c = 30;

    //Array declaration
    int a[];
    int number[];
    String studentName[];

    public static void main(String[] args) {
        // Approach 1
        int x [] = {10,20,30,40,50};
        System.out.println(x[0]);
        System.out.println(x[2]);
        System.out.println(x.length);//5

//        for(int i=0; i<x.length; i++){
//            System.out.print(x[i]+ " ");
//        }

        // Approach 2
        int z[] = new int[5];
        z[0] = 100;
        z[1] = 200;
        z[2] = 300;
        z[3] = 400;
        z[4] = 500;
       // z[5] = 600;
        System.out.println(z[4]);

        String courseName [] = {"Java", "C++", "Pythone"};
        System.out.println(courseName[1]);
    }
}
