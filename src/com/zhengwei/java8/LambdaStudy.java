package com.zhengwei.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: zhengwei
 * @Date: 2022/9/8
 * @Description:
 */
public class LambdaStudy {

    public static void main(String[] args) {
        List<Integer> nums = Stream.of(1,22,22,3,14).collect(Collectors.toList());

        Integer a = 0;

        //foreach
        //nums.forEach(System.out::println);

        //filter
        //nums.stream().filter(it -> it > 2).forEach(System.out::println);

        //sort
        //nums.stream().sorted().forEach(System.out::println);

        //distinct
        //nums.stream().distinct().forEach(System.out::println);

        //collect



    }


}
