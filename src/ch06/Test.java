/*
package ch06;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        User tom = new User (1,"name", LocalDate.now());
        User tomClone = (User) tom.clone();
        System.out.println("Tom" + tom);
        System.out.println("Tom Clone" + tom);
        System.out.println(tom == tomClone);
        System.out.println(tom.getBirthday() == tomClone.getBirthday());
    }

    public static class Person implements Cloneable{
        private String name;
        private Address address;


        @Override
      public Object clone() throws CloneNotSupportedException {
            Person p = (Person) super.clone();
            return p;
        }

        public Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName() {
            this.name = name;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", address=" + address +
                    '}';
        }
    }
}
*/
