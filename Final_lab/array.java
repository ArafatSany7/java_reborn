import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        ArrayList English = new ArrayList<>();
        ArrayList Hindi = new ArrayList<>();

        English.add("Inception");
        English.add("Intersteller");
        English.add("Tenet");

        Hindi.add("Dangal");
        Hindi.add("Kahani");
        Hindi.add("Piku");

        English.addAll(Hindi);

        System.out.println("List: " + English);

        English.remove(3);

        English.add(3, "Araynak");

        English.remove(4);
        System.out.println("List: " + English);

        System.out.println(English.contains("Araynak"));

    }
}