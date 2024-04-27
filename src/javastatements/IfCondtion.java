package javastatements;

public class IfCondtion {

    public static void main(String[] args) {
       isEligibleForVote();
    }

    public static void isEligibleForVote(){
        int age = 55;
        if (age>=18){
            System.out.println("Eligible for vote");
        }
        System.out.println("Hello");

    }
}
