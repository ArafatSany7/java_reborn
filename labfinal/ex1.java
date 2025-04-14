public class ex1 {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int res = x / y;

            System.out.println(res);

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Last line");
        }

    }
}
