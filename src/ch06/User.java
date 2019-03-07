package ch06;

import java.time.LocalDate;

public class User implements Cloneable{
    private int id ;
    private String name;
    private LocalDate birthday;

    public User(int i, String tom) {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = (User)super.clone();
        LocalDate localDate = LocalDate.of(
                birthday.getYear(),
                birthday.getMonth(),
                birthday.getDayOfMonth()
        );
        user.birthday = localDate;
        return user;
    }




    public User (int id , String name, LocalDate birthday){
        this.id = id ;
        this.name = name;
        this.birthday = birthday;
    }

}
class Test1 {
    public static void main(String[] args) {
        User tom = new User(1,"tom",LocalDate.now());
        User jerry = new User(1,"jerry",LocalDate.now());
        User ben = new User(1,"ben",LocalDate.now());
    }
}
