package exceptiondemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public  static void readFile(String fileName) throws FileNotFoundException {
        FileReader reader = new FileReader("file.txt");
        System.out.println("Hello");
    }

    public static  void readJungleBook(String fileName) throws FileNotFoundException{
        readFile(fileName);
    }

    public static void main(String[] args) {
        try {
            readJungleBook("abc.xls");
        }catch (FileNotFoundException e){

        }

    }

}
