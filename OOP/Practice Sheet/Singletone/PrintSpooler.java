public class PrintSpooler {
    private static PrintSpooler instance;

    private PrintSpooler() {
        System.out.println("Printing in queue");
    }

    public static PrintSpooler createObject() {
        if (instance == null) {
            PrintSpooler print = new PrintSpooler();
        }
        return instance;
    }

    public static void main(String[] args) {
        PrintSpooler queue1 = PrintSpooler.createObject();
        PrintSpooler queue2 = PrintSpooler.createObject();

        System.out.println(queue1 == queue2);
    }
}
