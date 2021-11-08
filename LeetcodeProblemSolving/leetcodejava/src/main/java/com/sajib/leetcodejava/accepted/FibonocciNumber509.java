package com.sajib.leetcodejava.accepted;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FibonocciNumber509 {




    public static void main(String[] args) {

        int n = 6;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = fibonocciNumber(n);
        System.out.println(ans);

    }
    private static int[] dp;
    private static int fibonocciNumber(int n) {

        if(n==0) return 0;
        if(n == 1 || n == 2) return 1;

        if(dp[n] != -1){
            return dp[n];
        }

        int a = fibonocciNumber(n-1);
        int b = fibonocciNumber(n-2);

        int sum = a+b;
        dp[n] = sum;

        return sum;
    }
}
