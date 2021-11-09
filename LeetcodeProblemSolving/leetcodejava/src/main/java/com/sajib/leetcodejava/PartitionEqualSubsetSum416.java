package com.sajib.leetcodejava;

import java.util.Arrays;

public class PartitionEqualSubsetSum416 {

    private static boolean result = false;
    private static int[] dp;

    public static void main(String[] args) {

        int []a = {1,5,11,5,2,1};

        result = false;
        int total = Arrays.stream(a).sum();
        dp = new int[total+1];
        Arrays.fill(dp,-1);

        result = generateSubset(0,a,0,total);
        System.out.println("result : "+ result);

    }



    private static boolean generateSubset(int index, int[] a,int sum,int total) {

        if(result == true){
            return true;
        }

        int remaining = total - sum;

        if(dp[remaining] != -1){
            if(dp[remaining] == 1){
                return true;
            }else{
                return false;
            }
        }

        if(index >= a.length){
            System.out.println("sum : "+sum+"  remaining: "+remaining);
            if(remaining == sum){
                result = true;
            }
            return false;
        }

        boolean subResult1 = false, subResult2 = false;
        if(sum+a[index]<= remaining ) {
           subResult1 =  generateSubset(index + 1, a, sum + a[index], total);
        }

        subResult2 = generateSubset(index + 1, a, sum, total);

        boolean subResult = subResult1 | subResult2;

        if(subResult){
            dp[remaining] = 1;
        }else{
            dp[remaining] = 0;
        }


        return subResult;

    }
}
