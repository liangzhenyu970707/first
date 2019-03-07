package ch06;

import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) {
        User [] user = {};
        Comparator<User> userSort = (o1, o2)->{
            if(o1.getId() > o2.getId())
                return 1;
            else if(o1.getId() == o2.getId())
                return 0;
            else return -1;
        };


        Arrays.sort(user, userSort);
    }
}
