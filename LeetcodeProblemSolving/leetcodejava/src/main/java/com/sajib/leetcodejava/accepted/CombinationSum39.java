package com.sajib.leetcodejava.accepted;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {


    static List<List<Integer>> resultedList = new ArrayList<List<Integer>>();

    static void printList(List<Integer> list){
        for (int item: list) {
            System.out.print(item);
        }
        System.out.println("");

    }

    static void generateCombinationSum(List<Integer> combination ,int sum, int[] candidates, int target, int previousItem){

        if(sum> target) return;

        if(sum == target){
           // printList(combination);
            resultedList.add(combination);
            return;
        }

        for(int item :candidates){

            if(item>= previousItem) {
                List<Integer> tempList = new ArrayList<>();
                tempList.addAll(combination);
                tempList.add(item);
                generateCombinationSum(tempList, sum + item, candidates, target, item);
            }
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{2, 3, 6,7};
        generateCombinationSum(new ArrayList<Integer>(),0,input,7,Integer.MIN_VALUE);
    }

}
