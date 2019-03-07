package ch14;

import java.util.concurrent.atomic.LongAdder;

public class Sum {
    public static LongAdder i = new LongAdder();



    public void inc() {
        i.add(1);
    }
    public int get(){
        return i.intValue();
    }
}
