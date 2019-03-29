package lab2_6;

public class Connection {
    public static void main(String[] args){
        ConnectionPoolSingleton c1,c2;
        try{
            c1=ConnectionPoolSingleton.getInstance();
            c1.manageJobs();
        }catch (ConnectionPoolException e){
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------");
        try{
            c2=ConnectionPoolSingleton.getInstance();
            c2.manageJobs();
        }catch (ConnectionPoolException e){
            System.out.println(e.getMessage());
        }
    }
}
