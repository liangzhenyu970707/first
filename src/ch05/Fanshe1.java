package ch05;

import java.lang.reflect.Array;

public class Fanshe1 {
    public static void main(String[] args) {
        Object array = Array.newInstance(int.class, 10);

int[] newArray = (int[])array;
System.out.println(newArray);
    }

}
