package lab2_4;

public class OracleFactory extends DatabaseFactory {
    public Connection createConnection(){
        return new oracleConnection();
    }
    public Statement createStatement(){
        return new oracleStatement();
    }
}
