
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arr2 {
    public static void main(String[] args) {

        ArrayList<String> cp = new ArrayList();
        ArrayList<String> op = new ArrayList<>();
        ArrayList<String> fin = new ArrayList<>();

        cp.addAll(Arrays.asList("Mike", "Mina", "Russel", "Rony", "Jack"));
        op.addAll(Arrays.asList("Jack", "Russel", "Tony", "Mike", "Mina"));

        Collections.sort(cp);
        Collections.sort(op);

        System.out.println(cp);
        System.out.println(op);

        if (cp.equals(op)) {
            System.out.println("Array is equal");
        } else {
            System.out.println("Array is not equal");
        }

        if (cp.contains("Alice") || cp.contains("Alice")) {
            System.out.println("beta Ache");
        } else {
            System.out.println("beta nai");
        }

    }
}
