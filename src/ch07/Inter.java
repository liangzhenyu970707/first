package ch07;
class Outer {


    public void f() {}

    private int i = 1;

    public static class Inter {
      public void g(){}

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inter inter =new Outer.Inter();


    }

}
