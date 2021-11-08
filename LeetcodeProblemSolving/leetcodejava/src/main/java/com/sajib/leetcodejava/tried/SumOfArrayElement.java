package com.sajib.leetcodejava.tried;

public class SumOfArrayElement {

    public static void main(String[] args) {
        int a[] = {1,2,3};
       int result =  reverseSum(a,0);
        System.out.println("");
        System.out.println(result);
    }

    private static void sum(int[] a,int index,int result) {

        if(index == a.length){
            System.out.println(result);
            return;
        }

        System.out.print(a[index]);
        sum(a,index+1,result+a[index]);

    }

    private static int reverseSum(int[] a,int index) {

        if(index == a.length){
            //System.out.println(result);
            return 0;
        }
        System.out.print(a[index]);



        return a[index]+reverseSum(a,index+1);
    }

}
