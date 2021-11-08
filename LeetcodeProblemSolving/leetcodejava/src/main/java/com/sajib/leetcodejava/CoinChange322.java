package com.sajib.leetcodejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChange322 {


    private static int[] dp;

    public static void main(String[] args) {
        int a[] = {1,5,7};
        dp = new int [19];

        Arrays.fill(dp,-1);
       System.out.println(coinChange(18,a));
    }

    private static int coinChange(int n, int[] a) {

        if(n == 0) {
            return 0;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int ans = Integer.MAX_VALUE;

        for (int i =0 ; i< a.length;i++){
            if(n - a[i]>= 0){
              int subMIn =  coinChange(n-a[i],a);
              if(subMIn != Integer.MAX_VALUE && subMIn+1<ans){
                  ans = subMIn+1;
              }
            }
        }

        dp[n] = ans;

        return ans;
    }


    private static int coinChange2(int n, int[] a) {

        if(n == 0) {
            //printList(result);
            return 0;
        }

        int ans = Integer.MAX_VALUE;

        int s1 = 0;
        int s2 = 0;

        if(n - a[0] >= 0) {
            s1 = coinChange2(n - a[0],a);
        }

        if(n - a[1] >= 0) {
            s2 = coinChange2(n - a[1],a);
        }

        if(s2>s1){
            ans = s1;
        }else{
            ans = s2;
        }

        return ans +1;
    }


//    static void printList(List<Integer> list){
//        for (int item: list) {
//            System.out.print(item);
//        }
//        System.out.println("");
//    }

}

