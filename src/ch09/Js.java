package ch09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Js {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(2);
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,5));
    }
}
