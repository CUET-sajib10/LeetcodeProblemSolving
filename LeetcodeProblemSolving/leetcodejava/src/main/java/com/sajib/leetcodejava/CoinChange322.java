package com.sajib.leetcodejava;

import java.util.ArrayList;
import java.util.List;

public class CoinChange322 {


    public static void main(String[] args) {
        int a[] = {5,2};
       System.out.println(coinChange(7,a));
    }

//    private static void coinChange(int n, int[] a, List<Integer> result) {
//
//        if(n ==0) {
//            printList(result);
//            return;
//        }
//
//        for (int i =0 ; i< a.length;i++){
//            if(n - a[i]>=0){
//
//                List<Integer> tempList = new ArrayList<>();
//                tempList.addAll(result);
//                tempList.add(a[i]);
//                coinChange(n-a[i],a,tempList);
//            }
//        }
//    }

    private static int coinChange(int n, int[] a) {

        if(n ==0) {
            //printList(result);
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for (int i =0 ; i< a.length;i++){
            if(n - a[i]>= 0){
              int subMIn =  coinChange(n-a[i],a);
              if(subMIn+1<ans){
                  ans = subMIn+ 1;
              }
            }
        }

        return ans;
    }

//    static void printList(List<Integer> list){
//        for (int item: list) {
//            System.out.print(item);
//        }
//        System.out.println("");
//    }

}

