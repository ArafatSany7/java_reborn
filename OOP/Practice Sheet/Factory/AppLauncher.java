interface Database {
    String Contact(String contact);
}

class MySQLDatabase implements Database {
    public String Contact(String C) {
        return "Contact Saved " + C;
    }
}

class PostgreSQLDatabase implements Database {
    public String Contact(String C) {
        return "Contact Saved " + C;
    }
}

class MongoDBDatabase implements Database {
    public String Contact(String C) {
        return "Contact Saved " + C;
    }
}

class DataBaseFactory {
    public static Database create(String method) {
        return switch (method) {
            case "SQL" -> new MySQLDatabase();
            case "POST" -> new PostgreSQLDatabase();
            case "MONGO" -> new MongoDBDatabase();
            default -> throw new IllegalArgumentException("Unknown Databse " + method);
        };
    }
}

public class AppLauncher {
    public static void main(String[] args) {
        Database SQL = DataBaseFactory.create("SQL");
        Database POST = DataBaseFactory.create("POST");

        System.out.println("This " + SQL.Contact("as SQL"));
    }
}
