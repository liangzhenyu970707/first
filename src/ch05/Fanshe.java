package ch05;

import java.lang.reflect.*;
import java.util.Arrays;


public class Fanshe {


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        Class cl = Person.class;
        /*Constructor [] constructors = cl.getConstructors();
        for (int i = 1; i < constructors.length; i++)
            System.out.println(constructors[i]);

        System.out.println("======================");
        constructors = cl.getDeclaredConstructors();

        for (Constructor a : constructors)
            System.out.println(a);*/

        /*Person tom = new Person();
        Person Jerry = new Person();
        Field id = cl.getField("id");

        id.set(tom,1);
        id.set(Jerry,2);

        Field name = cl.getDeclaredField("name");
        name.setAccessible(true);
        name.set(tom,"tom");
        name.set(Jerry,"jerry");
        System.out.println(tom + "\n" + Jerry);
*/
/*
      Person P = new Person();
      Method goo = cl.getDeclaredMethod("goo");
      goo.setAccessible(true);//共有的方法需要改成公有
      goo.invoke(P);
      Method foo = cl.getDeclaredMethod("foo",int.class, double.class);
      foo.setAccessible(true);
      foo.invoke(P);//括号里放的是对象名*/
 /*Constructor constructorNoArgs = cl.getConstructor();
 Person person = (Person)(constructorNoArgs.newInstance());
    System.out.println(person);

    Constructor constructor = cl. getConstructor(String.class, int.class, int.class );
    person = (Person)constructor.newInstance("tom",1,1);
    System.out.println(person);
*/



    }
}
