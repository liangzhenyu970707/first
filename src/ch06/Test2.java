package ch06;


import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test2c tom= new Test2c(1,"tom", new Date());
        Test2c tomc = (Test2c) tom.clone();
        System.out.println(tom == tomc);
        System.out.println(tom.getBirthday() == tomc.getBirthday());

    }
}
