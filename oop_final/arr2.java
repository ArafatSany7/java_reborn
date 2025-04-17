import java.util.ArrayList;
import java.util.Collections;

public class arr2 {
    public static void main(String[] args) {

        ArrayList<String> ficition = new ArrayList<>();
        ArrayList<String> non_fiction = new ArrayList<>();

        ficition.add("Harry potter");
        ficition.add("The hobbit");
        ficition.add("1984");

        non_fiction.add("Sapiens");
        non_fiction.add("educated");
        non_fiction.add("becoming");

        ArrayList<String> finalList = new ArrayList<>();
        finalList.addAll(ficition);
        finalList.addAll(non_fiction);

        finalList.remove("1984");

        System.out.println(ficition);
        System.out.println(non_fiction);
        System.out.println(finalList);

        if (finalList.contains("Haryy potter")) {
            int index = finalList.indexOf("Harry potter");

            System.out.println("Book is available at index of : " + index);
        } else {
            System.out.println("book is not available");
        }

        Collections.sort(finalList);
        System.out.println("Sorted Final lis : " + finalList);

    }
}
