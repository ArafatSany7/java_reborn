
import java.util.ArrayList;

public class arr1 {
    public static void main(String[] args) {
        ArrayList<String> cityA = new ArrayList<>();
        ArrayList<String> cityB = new ArrayList<>();
        ArrayList<String> Final = new ArrayList<>();

        cityA.add("Sofia");
        cityA.add("Emma");
        cityA.add("Olivia");

        cityB.add("Liam");
        cityB.add("Noah");
        cityB.add("Ava");

        Final.addAll(cityA);
        Final.addAll(cityB);

        System.out.println(cityA);
        System.out.println(cityB);
        System.out.println(Final);

        Final.remove("Ava");
        System.out.println("Array after deleting last perticipant : " + Final);

        if (Final.contains("Sofia")) {
            int index = Final.indexOf("Sofia");
            System.out.println("Sofia is present at index number : " + index);
        } else {
            System.out.println("Sofia is not present ");
        }

    }

}
