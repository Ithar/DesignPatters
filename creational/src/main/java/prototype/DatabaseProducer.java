package prototype;

import prototype.types.Database;
import prototype.types.MsSql;
import prototype.types.MySql;
import prototype.types.Oracle;

import java.util.HashMap;
import java.util.Map;

public class DatabaseProducer {

  private static Map<DatabaseType, Database> DATABASES = new HashMap<>();

  static {
    DATABASES.put(DatabaseType.MYSQL, new MySql("MY SQL", new DummyDriver(3306)));
    DATABASES.put(DatabaseType.MSSQL, new MsSql("MS SQL", new DummyDriver(1433)));
    DATABASES.put(DatabaseType.ORACLE, new Oracle("Oracle", new DummyDriver(3938)));
  }

  public static Database getByType(DatabaseType type) {
    return DATABASES.get(type);
  }

  public enum DatabaseType {
    MYSQL,
    MSSQL,
    ORACLE;
  }
}
