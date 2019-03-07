package ch06;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.IntToLongFunction;

public class Paixu {
    public static void main(String[] args) {

        User[] user= {
                new User(3,"tom", LocalDate.of(1998,1,1)),
                new User(1,"tom", LocalDate.of(2000,1,1)),
                new User(2,"tom", LocalDate.of(2001,1,1)),
                new User(1,"tom", LocalDate.of(1997,1,1)),
        };
        Arrays.sort(user, Comparator.comparing(User::getId).reversed());






    }

    }

