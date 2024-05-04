package iterationstatements;

public class ForLoopDemo {

    public static void main(String[] args) {

//        for(int i=0; i<11; i++){
//            System.out.println(i);
//        }

//        for(int i=5; i<=10; i++){
//            System.out.println(i);
//        }

//        for(int i=10; i>=1; i--){
//            System.out.println(i);//10,9,8,  ,,1
//        }

        //print odd number between 1 to 10 (1,3,5,7,9)
//         for(int i =1; i<=10; i++){
//             if(i%2!=0){
//                 System.out.println(i);//1,3,5,7,9
//             }
//         }
         //print even number between 1 to 20
//        for(int i=1; i<=20; i++){
//            if(i%2==0){
//                System.out.println(i);
//            }else {
//                System.out.println("This is not required number");
//            }
//        }

        //print 1,2,3,4,6,8,9,10
        for(int i=1; i<=10; i++){
            if(i!=5 && i!=7){
                System.out.println(i);
            }
        }

    }


}
