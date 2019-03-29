package lab2_9;

public class CloneTest {
    public static void main(String[] args) {
        Address address=new Address("中国","江西","南昌");
        Customer c1=new Customer("吕行一", address);
        Customer c2=null;
        try {
            c2 = (Customer)c1.deepClone();
        }catch(Exception e){
            e.printStackTrace();
        }
        //c2.getAddress();//setCity("北京");
        System.out.println("c1 "+c1.toString());
        System.out.println("c2 "+c2.toString());
    }
}
