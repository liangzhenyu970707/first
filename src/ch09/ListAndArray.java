package ch09;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListAndArray {
    public static void main(String[] args) {
        //数组和集合的互换
        Integer[] arr = {1,2,3,4,8,6};
        //list也是一个假的集合,只是一个视图(只能看不能改)
        List<Integer> list = Arrays.asList(arr);
        //list.add(9);会抛异常
        list.forEach(e->System.out.printf("%3d",e));
        System.out.println();

        List<Integer> list1 = new ArrayList<>(list);
        list1.add(9);
        list1.forEach(e->System.out.printf("%3d",e));

        Object[] arr1 = list1.toArray();
        Arrays.stream(arr1).forEach(e->System.out.printf("%3d",e));
        list1.subList(1,3).forEach(e->System.out.printf("%3d",e));
        //生成一个新集合，但这个集合也是假的，不能被修改
        List<Integer> list2 = Collections.unmodifiableList(list1);
        //生成一个不能被修改的只读集合


    }
}
