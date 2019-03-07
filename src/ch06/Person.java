/*
package ch06;

class Street implements Cloneable{}
class Address implements    Cloneable{
    private Street street;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    private String name;
   private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person p = (Person)super.clone();.
        p.address  =(Address)this.address.clone();

        return p;
    }

    public  Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}



*/
