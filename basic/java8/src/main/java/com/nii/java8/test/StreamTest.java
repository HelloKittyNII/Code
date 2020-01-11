package com.nii.java8.test;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Description java8流测试类
 * @Author wzj
 * @Date 2020/1/11 21:30
 **/
public class StreamTest {

    /**
     * 生成流
     */
    @Test
    public void general() {
        //1、第一种方式通过列表生成
        List<String> stringList = Lists.newArrayList("aa", "bb", "cc");
        System.out.println(stringList.stream().count());

        //2、第二种方式通过数组生成
        List<String> strings = Arrays.asList("aa", "bb");
        System.out.println(strings.stream().count());
    }
}
