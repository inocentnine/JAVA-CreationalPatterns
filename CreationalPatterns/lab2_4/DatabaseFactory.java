package lab2_4;

public abstract  class DatabaseFactory {
    public abstract Connection createConnection();

    public abstract Statement createStatement();
}
