package prototype;

import prototype.types.Database;

public class Client {

    public static void main(String[] args) {
        Database mysql = DatabaseProducer.getByType(DatabaseProducer.DatabaseType.MYSQL);
        System.out.println(mysql.toString());

        Database mssql = DatabaseProducer.getByType(DatabaseProducer.DatabaseType.MSSQL);
        System.out.println(mssql.toString());

        Database oracle = DatabaseProducer.getByType(DatabaseProducer.DatabaseType.ORACLE);
        System.out.println(oracle.toString());
    }

}