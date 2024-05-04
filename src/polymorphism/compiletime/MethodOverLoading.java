package polymorphism.compiletime;

/**
 * Compiletime polymorphism
 * Early binding, static binding
 */
public class MethodOverLoading {
    /**
     * 1. different data type
     * 2. different number of args/params
     * 3. different squence of arguments
     * @param
     */

    public void m1(int a){

    }
    public void m1(int a, int b){

    }
    public void m1(int a, String name){

    }
    public void m1(String name, int a){

    }

    public void m1(String firstNaem, String lastName){

    }

    public void addition(int a, int b){
        int answer = a+b;
    }

    public void addition(int a, int b, int c){
        int answer = a+b+c;
    }


}
