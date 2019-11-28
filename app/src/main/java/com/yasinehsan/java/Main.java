package com.yasinehsan.java;

public class Main {


    public static int fib1(int n){
        if(n <= 1)
            return n;
        System.out.println(n);
        return fib1(n-2) + fib1(n-1);
    }

    public static int fib2(int n){
        int[] dp = new int[1000];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

//    public static int fib3(int n){
//        int base1 = 0, base2 = 1;
//
//        for(int i )
//    }







    public static void main(String[] args){
        System.out.println("printing 123");

        int[] arr = {1,2,3,4,5,100,111};
        System.out.println(fib2(9));

    }
}
