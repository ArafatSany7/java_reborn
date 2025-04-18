import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class team {

    public static void main(String[] args) {

        ArrayList<String> x = new ArrayList<>();
        ArrayList<String> y = new ArrayList<>();

        x.addAll(Arrays.asList("Alice", "BOB", "Charlie", "Diana"));
        y.addAll(Arrays.asList("Eve", "Charlie", "Frank", "Alice"));

        ArrayList<String> common = new ArrayList<>(x);
        common.retainAll(y);
        System.out.println("Common between two team : " + common);

        x.addAll(y);
        ArrayList<String> mwd = new ArrayList<>(new HashSet<>(x));
        System.out.println("Merged without duplicate: " + mwd);

        Collections.sort(x);
        System.out.println("Sorted teamX : " + x);

        if (x.contains("Frank")) {
            System.out.println("Ache");
        } else {
            System.out.println("Nai");
        }
        x.add(1, "Grace");
        x.remove(4);

        System.out.println("Updated teamX list: " + x);

        System.out.println(y.contains("Diana") ? "Ache" : "Nai");

        for (String all : mwd) {
            System.out.println(all);

        }

    }
}
