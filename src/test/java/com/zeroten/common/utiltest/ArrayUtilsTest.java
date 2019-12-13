package com.zeroten.common.utiltest;

import org.testng.annotations.Test;
import com.zeroten.common.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayUtilsTest {
    @Test
    public void arrySortTest(){
        int[] testArrays = new int[20];

        for(int index=0; index<testArrays.length; index++){
            testArrays[index] = new Random().nextInt(100);
        }
        System.out.println("排序前数组："+Arrays.toString(testArrays));
        int[] resultArray = ArrayUtils.sort(testArrays);

        System.out.println("排序后数组:"+Arrays.toString(resultArray));
    }
}
