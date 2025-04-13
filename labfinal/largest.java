
import java.util.*;
import java.util.stream.Collectors;

public class largest {
    public static void main(String[] args) {
        // int[] num = { 3, 4, 5, 6 };
        List<Integer> num = Arrays.asList(3, 9, 4, 8, 5, 5, 6, 7);

        int larg = num.stream().mapToInt(Integer::intValue).max().getAsInt();
        int min = num.stream().mapToInt(Integer::intValue).min().getAsInt();
        int sum = num.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Largest number is : " + larg);
        System.out.println("Minimum number is : " + min);
        System.out.println("sum number is : " + sum);

        List<Integer> uniq = num.stream().distinct().collect(Collectors.toList()); // Duplicate element removed here
        Collections.sort(num); // Array Sorted here
        System.out.println("After remove duplicated number Sorted array are : " + uniq);

        // int larg = num[0];

        // for (int i = 1; i < num.length; i++) {
        // if (num[i] > larg) {
        // larg = num[i];
        // }
        // }

        Collections.reverse(num); // Array reversed here
        System.out.println("Reverse array is : " + num);

    }
}
