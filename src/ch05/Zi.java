package ch05;

public class Zi extends Fu {
    private String z;

    public Zi() {
        super();//子类构造器中如果没有用this()来调本类的其余构造器，就会被自动加入super();
        //这句话的意思是调用父类的无参构造器
        //super()必须出现在构造器的第一行
        System.out.println("Zi :" + z);
    }

    public  Zi(String z,String f) {
        super();//调用父类一个带String参数的构造器
        this.z=z;
        System.out.println("Zi: " + z);
    }

    @Override
    public String toString() {
        return "Zi{" +
                "z='" + z + '\'' +
                '}';
    }


}
