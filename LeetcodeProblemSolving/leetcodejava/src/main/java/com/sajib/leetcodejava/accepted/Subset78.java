package com.sajib.leetcodejava.accepted;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset78 {

    static List<List<Integer>> resultedList = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        return null;
    }


    static void generateSubset(List<Integer>result, int index,int [] nums){

        if(index<0){
//            for (int num: result) {
//                System.out.print(num);
//            }
//            System.out.println("");
            resultedList.add(result);
            return;
        }

        List<Integer> tempList = new ArrayList<>();
        tempList.addAll(result);
        tempList.add(nums[index]);
        generateSubset(tempList,index-1,nums);

        generateSubset(result,index-1,nums);
    }

    public static void main(String[] args) {

        int[] input = new int[]{3, 2, 1};
        generateSubset(new ArrayList<Integer>(),input.length-1,input);

    }
}
