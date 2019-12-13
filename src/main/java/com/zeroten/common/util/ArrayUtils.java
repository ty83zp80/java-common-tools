package com.zeroten.common.util;

public class ArrayUtils {
    /*
    *对传入的 int 数组进行排序，从小到大，并返回排序后的结果,冒泡排序
    * */
    public static int[] sort(int[] arr){
        int len = arr.length;

        if(len>0){
            for(int index=1; index<len; index++){
                for(int inIndex=0; inIndex<len-index; inIndex++){
                    int max = arr[inIndex];
                    if(max>arr[inIndex+1]){
                        arr[inIndex] = arr[inIndex+1];
                        arr[inIndex+1] = max;
                    }
                }
            }
        }else{
            System.out.println("数组长度不符合排序要求，无法排序");
        }
        return arr;
    }
}
