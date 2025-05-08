package Lesson3.structuralDesignPatterns.proxy;

public class SqlDatabaseProxy implements Database {
    private SqlDatabase sqlDatabase;
    private String authorizedUser;


    public SqlDatabaseProxy(String userName) {
        this.authorizedUser = userName;
        this.sqlDatabase = new SqlDatabase();
    }

    @Override
    public void confidentialInformation() {
        if (sqlDatabase.getUserName().equals(authorizedUser)) {
            sqlDatabase.confidentialInformation();
        } else {
            System.out.println("Access Denied.");
        }
    }

}
