package DSA.recursion;

import java.util.Scanner;

public class V1_2 {

    // question 2
    public static void printName(int n) {
        if(n == 0) return;
        System.out.println("name");
        printName(n-1);
    }

    public static void print1N(int i , int n){
        if(i > n) return;
        System.out.print(i + " ");
        print1N(i+1, n);
    }
    public static void printN1(int i , int n){
        if(i < 1) return;
        System.out.print(i + " ");
        printN1(i-1, n);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printN1(n, n);
    }
}
