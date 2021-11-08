package com.sajib.leetcodejava.tried;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresss93 {



    static List<String> resultedList = new ArrayList<String>();

    static void printList(List<Integer> list){
        for (int item: list) {
            System.out.print(item);
        }
        System.out.println("");
    }

    static void generateCombinationSum(String ip , String input, int depth, int previousIndex){

        if(depth <= 0){
            resultedList.add(ip);
            System.out.println(ip);
            //printList(combination);
            return;
        }

        for(int i=previousIndex+1;i<input.length();i++){

            String subString = input.substring(i,i+1);
            if((subString.length()>1 && subString.startsWith("0"))){
                continue;
            }
            generateCombinationSum(ip+subString+".",input,depth-1,i);
        }
    }

    private static boolean isValidIp(String a) {

        if(!a.equals("") && Integer.parseInt(a) <=255 && Integer.parseInt(a)>=0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "1234";
        generateCombinationSum("",str,3,-1);
    }
}
