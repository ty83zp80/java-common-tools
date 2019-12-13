package com.zeroten.common.util;

public class CheckUtils {
    /*
    * String... strings 为可变参数
    *如果 strings 中有 任意⼀个字符串为空
    *则返回 false
    *否则返回 true
    * */
    public static boolean isAnyEmpty(String... strings){
        for(int i=0;i<strings.length;i++){
            if( strings[i] == null || strings[i].equals("")){
                return false;
            }
        }
        return true;
    }
    /*
    * 判断引⽤类型数组是否为空
    *为空或 null 则返回 true
    *否则返回 false
    * */
    public static boolean isEmpty(Object[] arr){
        if(arr == null){
            return true;
        }
        for(int index =0; index<arr.length; index++){
            if(arr[index] != null){
                return false;
            }
        }
        return true;
    }
    /*
    * 判断 str1 和 str2 字符串是否相等
    * 相等则返回 true
    * 否则返回 false
    * 当其中⼀个是 null 时返回 false
    * */
    public static boolean equalsString(String str1, String str2){
        if (str1 != null && str2 != null) {
            if (str1.equals(str2)) {
                return true;
            }
        }
        if(str1 == null && str2 == null){
            return true;
        }
        return false;
    }
    /*
    *判断 n1 和 n2 的值是否相等
    *相等则返回 true
    *否则返回 false
    * 当其中⼀个是 null 时返 回 false
    * */
    public static boolean equalsInteger(Integer n1, Integer n2){
        if(n1 != null && n2 != null){
            if(n1.equals(n2)){
                return true;
            }
        }
        if(n1 == null && n2 == null){
            return true;
        }
        return false;
    }
}
