package javastatements;

public class NestedIfElse {

    public static void main(String[] args) {
        int marks = 40;

        if (marks>=80){
            System.out.println("Distinction");
        }else if (marks>=70){
            System.out.println("First Clas");
        }else if (marks>50){
            System.out.println("Second Class");
        }else if (marks>35){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
        System.out.println("My mark is :"+ marks);

    }

}
