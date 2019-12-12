package com.zeroten.common.utiltest;

import  com.zeroten.common.util.CheckUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class CheckUtilsTest {
    @Test
    public void fnTest(){
        //isAnyEmpty测试用例
        Assert.assertEquals(CheckUtils.isAnyEmpty("xyz","abc"),true);
        Assert.assertEquals(CheckUtils.isAnyEmpty("xyz",null),false);

        //isEmpty 测试用例
        Assert.assertEquals(CheckUtils.isEmpty(null),true);
        Object[] objs = new Object[10];
        Assert.assertEquals(CheckUtils.isEmpty(objs),true);

        //equals 字符串相等判定 测试用例
        Assert.assertEquals(CheckUtils.equalsString("xyz",null),false);
        Assert.assertEquals(CheckUtils.equalsString("xyz","abc"),false);
        Assert.assertEquals(CheckUtils.equalsString("xyz","xyz"),true);
        Assert.assertEquals(CheckUtils.equalsString(null,null),false);

        //equals Integer相等判定 测试用例
        Assert.assertEquals(CheckUtils.equalsInteger(10,null),false);
        Assert.assertEquals(CheckUtils.equalsInteger(10,20),false);
        Assert.assertEquals(CheckUtils.equalsInteger(10,10),true);
        Assert.assertEquals(CheckUtils.equalsInteger(null,null),false);
    }
}
