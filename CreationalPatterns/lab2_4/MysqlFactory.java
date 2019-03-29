package lab2_4;

public class MysqlFactory extends DatabaseFactory {
    public Connection createConnection(){
        return new mysqlConnection();
    }
    public Statement createStatement(){
        return new mysqlStatement();
    }
}
