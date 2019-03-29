package lab2_6;

public class ConnectionPoolSingleton {
    private static ConnectionPoolSingleton instance=null;
    private ConnectionPoolSingleton(){

    }
    public static ConnectionPoolSingleton getInstance() throws ConnectionPoolException{
        if(instance==null){
            System.out.println("创建连接池!");
            instance=new ConnectionPoolSingleton();
        }
        else{
            throw new ConnectionPoolException("连接池正在工作中！");
        }
        return instance;
    }
    public void manageJobs(){
        System.out.println("管理连接任务！");
    }
}
