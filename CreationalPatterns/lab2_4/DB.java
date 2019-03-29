package lab2_4;

public class DB {
    public static void main(String[] args){
        DatabaseFactory dFactory=null;
        Connection connection;
        Statement statement;
        try{
            dFactory=(DatabaseFactory)XMLUtil.getBean();
        }catch (Exception e){
            e.printStackTrace();
        }

        if(dFactory==null){
            System.out.println("未获取到对象");
        }else{
            connection=dFactory.createConnection();
            statement=dFactory.createStatement();
            connection.connection();
            statement.statement();
        }
    }
}
