
import java.util.*;

public class largest {
    public static void main(String[] args) {
        // int[] num = { 3, 4, 5, 6 };
        List<Integer> num = Arrays.asList(3, 4, 5, 6, 7);
        Collections.reverse(num);

        // int larg = num[0];

        // for (int i = 1; i < num.length; i++) {
        // if (num[i] > larg) {
        // larg = num[i];
        // }
        // }
        int larg = num.stream().mapToInt(Integer::intValue).max().getAsInt();
        int min = num.stream().mapToInt(Integer::intValue).min().getAsInt();

        System.out.println("Reverse array is : " + num);
        System.out.println("Largest number is : " + larg);
        System.out.println("Minimum number is : " + min);
    }
}
