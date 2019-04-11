package practice;

import java.util.function.Function;

public class Fibonnachi {

    int fib(int n){
        return n <= 2 ? n - 1 : fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Fibonnachi f = new Fibonnachi();
        System.out.println(f.fib(4));
    }
}
