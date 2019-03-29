package lab2_5;

public class Order {
    public static void main(String[] args){
        try{
             Chef chef;
             Rice rice;
             Noodles noodles;
             chef=(Chef)XMLUtil.getBean();
             rice=chef.cookedRice();
             rice.Rice();
             noodles=chef.cookedNoddles();
             noodles.Noodles();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
