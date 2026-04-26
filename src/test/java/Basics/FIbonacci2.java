package Basics;

public class FIbonacci2 {
    public static void main(String[] args) {
        for (int i = 0; i <20 ; i++) {
            System.out.print(fibonacci(i)+" ");
        }

    }

    private static int fibonacci(int n) {
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
