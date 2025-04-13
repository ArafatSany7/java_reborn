
class calu {
    int add(int a, int b) {
        return a + b;
    }

    int div(int a, int b) {
        return a / b;
    }

    int mult(int a, int b) {
        return a * b;
    }
}

public class calculator {
    public static void main(String[] args) {
        calu cal = new calu();
        System.out.println("Summation is : " + cal.add(50, 60));
    }
}
