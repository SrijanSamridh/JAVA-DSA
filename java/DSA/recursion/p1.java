package DSA.recursion;

public class p1 {
    public static void print(int start, int end){
        if(start > end) return; // base case

        System.out.println( start ); // recursion execution

        print(++start, end); // recursive call
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int fib(int n){
        if(n <= 1) return n;
        int fst = fib(n-1);
        int snd = fib(n-2);
       return  fst + snd;
    }

    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
