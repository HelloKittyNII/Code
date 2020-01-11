package com.nii.java8.test;

import com.google.common.collect.Lists;
import com.nii.java8.model.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description java8流测试类
 * @Author wzj
 * @Date 2020/1/11 21:30
 **/
public class StreamTest {

    /**
     * 学生列表
     */
    private List<Student> studentList = null;

    @Before
    public void before() {
        studentList = Lists.newArrayList(new Student(21, "张三", false, 89.1),
                new Student(1, "李四", true, 90.0),
                new Student(2, "赵六", true, 60.0));
    }

    /**
     * 生成流
     */
    @Test
    public void generalTest() {
        //1、第一种方式通过列表生成
        List<String> stringList = Lists.newArrayList("aa", "bb", "cc");
        System.out.println(stringList.stream().count());

        //2、第二种方式通过数组生成
        List<String> strings = Arrays.asList("aa", "bb");
        System.out.println(strings.stream().count());
    }

    /**
     * 遍历 foreach
     */
    @Test
    public void foreachTest() {
        List<String> stringList = Lists.newArrayList("aa", "bb", "cc");
        stringList.stream().forEach(s -> System.out.println(s));
    }

    /**
     * 过滤 filter
     */
    @Test
    public void filterTest() {
        //过滤大于80分学生
        List<Student> students = studentList.stream().filter(student -> student.getMathScore() > 80.0).collect(Collectors.toList());
        System.out.println(students);

        //过滤身高
        List<Student> student2 = studentList.stream().filter(Student::isHigh).collect(Collectors.toList());
        System.out.println(student2);
    }

    /**
     * map
     */
    public void mapTest(){

    }
}
