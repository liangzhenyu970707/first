package ch06;

 interface Usb  {
    public abstract void foo();
    //接口中的方法修饰符都是 public abstract ,即便不写也是
    public static final int i =1;
    //接口中的属性都是public static final，即便不写也是

    //下面两个语法点在java 8 中新添加
    public static void goo(){
        System.out.println("goo..........");
    }//静态方法可以实现

    public default void hoo(){
        System.out.println("hoo.............");
    }//默认方法可以实现
    //static方法和类中的static方法一样，用类名或接口名调用即可
    //default方法用实现了接口的对象调用，该方法可以被覆盖

}


class Test10{
    public static void main(String[] args) {
            Usb.goo();

    }
}
