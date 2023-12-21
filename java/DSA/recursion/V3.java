package DSA.recursion;

public class V3 {
    public static int sum(int i, int n){
        if(i < 0) return n;
        return sum(i-1, n+i);
    }
    public static int sum(int n){
        if(n<0) return 0;
        return n + sum(n-1);
    }
    public static int product(int i, int n){
        if(i < 1) return n;
        return product(i-1, n*i);
    }
    public static int product(int n){
        if(n<1) return 1;
        System.out.println(n);
        return n * product(n-1);
    }
    public static void main(String[] args) {
        System.out.println(product(5, 1));
    }
}
