
public class DBconnection {
    private static DBconnection instance;

    private DBconnection() {
        System.out.println("Database Connected");

    }

    public static DBconnection createObject() {
        if (instance == null) {
            instance = new DBconnection();
        }
        return instance;
    }

    public static void main(String[] args) {
        DBconnection user1 = DBconnection.createObject();
        DBconnection user2 = DBconnection.createObject();

        System.out.println(user1 == user2);
    }

}
