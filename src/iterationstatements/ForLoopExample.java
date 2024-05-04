package iterationstatements;

public class ForLoopExample {

    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May"};
        String [] cars ={"BMW", "AUDI"};

//        for(int i=0; i<months.length; i++){
//            System.out.println(months[i]);
//        }
//        for(int i=0; i<cars.length; i++){
//            System.out.println(cars[i]);
//        }

        for(String monthName : months){
            System.out.println(monthName);
        }

        for(String carName : cars){
            if(carName == "AUDI"){
                System.out.println(carName+ " is available");
            }
         //   System.out.println(carName);
        }


    }

}
