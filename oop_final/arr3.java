
import java.util.ArrayList;
import java.util.Collections;

public class arr3 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> Final = new ArrayList<>();

        A.add(85);
        A.add(90);
        A.add(78);

        B.add(88);
        B.add(76);
        B.add(92);

        Final.addAll(A);
        Final.addAll(B);

        Final.remove((Integer) Collections.min(Final));

        System.out.println(A);
        System.out.println(B);
        System.out.println(Final);

        if (Final.contains(90)) {
            int index = Final.indexOf(90);
            System.out.println("90 found at index : " + index);
        } else {
            System.out.println("Not found");
        }

        Collections.sort(Final, Collections.reverseOrder());
        System.out.println(Final);

        int sum = 0;
        for (int num : Final) {
            sum += num;
        }
        double avg = sum / Final.size();
        System.out.println("Avarage number is : " + avg);

    }
}
