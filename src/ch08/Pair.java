package ch08;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pair <T> {



        private T second;
        public void setSecond (T newValue){
       /* ArrayList a = new ArrayList();
        second = newValue;*/
            Pair<String> a = new Pair();
            Pair<Integer> b = new Pair();
            if (a instanceof Pair) {
            }
            a = (Pair) b;
            System.out.println(a.getClass() == b.getClass());

        }

    }


class DateInterval extends Pair<LocalDate>{
    @Override
    public void setSecond(LocalDate newValue){
        @SuppressWarnings("all")
        int i = 1;


    }
}