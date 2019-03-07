package ch06;

import java.util.Date;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Test2c implements Cloneable {
    private int id ;
    private String name;
    private Date  birthday;

    public Test2c(int id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       Test2c t = (Test2c) super.clone();
        Date d  = (Date) this.birthday.clone();
        t.setBirthday(d);
        return t;
    }
}
