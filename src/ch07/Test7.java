package ch07;

public class Test7 {

    static void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            throw new Exception("f里面的异常",e);

        }
    }
    static void g()throws Exception{
        Exception e= new Exception("g里面的异常");
        throw e;
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
