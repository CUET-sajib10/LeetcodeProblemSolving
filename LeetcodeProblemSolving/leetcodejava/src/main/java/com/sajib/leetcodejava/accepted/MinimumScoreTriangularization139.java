package com.sajib.leetcodejava.accepted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumScoreTriangularization139 {

   // static List<List<Integer>> resultedList = new ArrayList<List<Integer>>();

    int result = 0;

    static void printList(List<Integer> list){
        for (int item: list) {
            System.out.print(item);
        }
        System.out.println("");

    }

    static void generateCombinationSum(List<Integer>result, int index,int [] nums, int target,int sum){

        if(sum > target) return;

        if(index>= nums.length){
            if(sum == target) {
                //printList(result);
               // resultedList.add(result);
            }
            return;
        }

        List<Integer> tempList = new ArrayList<>();
        tempList.addAll(result);
        tempList.add(nums[index]);
        generateCombinationSum(tempList,index+1,nums, target,sum+nums[index]);

        int nextUniqItemIndex = index+1; // skip same item
        for (int i = index; i< nums.length;i++) {
            if(i+1 < nums.length && nums[i] == nums[i+1] ){
                nextUniqItemIndex ++;
            }else{
                break;
            }
        }
        generateCombinationSum(result,nextUniqItemIndex,nums,target,sum);
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 1, 2};
        Arrays.sort(input);
        generateCombinationSum(new ArrayList<Integer>(),0,input,3,0);
    }
}
