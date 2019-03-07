package ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class A {
}

public class Student extends Person {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList();
        list.add(5);
        list.add(100);
        list.add(0);
        list.add(7);
        list.forEach(System.out::println);
        list.remove(1);
        list.forEach(e -> System.out.printf("%-3d",e));
        System.out.println("\n" + "hah ");
        list.sort(Integer::compareTo);




    }
}
