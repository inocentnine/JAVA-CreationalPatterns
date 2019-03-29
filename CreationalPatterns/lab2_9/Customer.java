package lab2_9;

import java.io.*;

public class Customer implements Serializable {
    private String name;
    private Address address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Customer：address=" + address + ", name=" + name ;
    }

    public Customer clone(){
        Customer clone=null;
        try {
            clone=(Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public Object deepClone() throws Exception {
        //将对象写入流中
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return(ois.readObject());
    }
}
