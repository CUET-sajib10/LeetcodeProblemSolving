package com.sajib.leetcodejava;

import java.util.Arrays;

public class ClimbingStairs70 {


    private static int[] dp;

    public static void main(String[] args) {

        int []a = {1,2};
        
        int n = 2;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        int result = findClimbingWay(n,a);
        System.out.println(result);
    }

    private static int findClimbingWay(int n, int[] a) {

        if(n == 0){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int count1 = 0, count2 = 0;

        if(n-a[0]>=0){
            count1 = findClimbingWay(n-a[0],a);
        }

        if(n-a[1]>=0){
            count2 = findClimbingWay(n-a[1],a);
        }

        int sum = count1 + count2;
        dp[n] = sum;
        return sum;
    }
}
