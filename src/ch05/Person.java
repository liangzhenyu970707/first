package ch05;



public class Person{
    private String name;
    private int age;
    public int id ;

    public void foo (int i , double d){}
    private void goo (){
        System.out.println("goo.......................");
    }

    public Person() {}

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
