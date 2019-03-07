package ch08;

class Node<T,E>{
    private T date;
    private E num ;
    private String name;
    public static <A,B> A f(){
        A a = null;
        return a;
    }
}

public class Test {
    public static void main(String[] args) {


        Node<Integer, Double> node = new Node();
        Node<String, String> node1 = new Node();
        Node.<String,String>f();


    }
}
