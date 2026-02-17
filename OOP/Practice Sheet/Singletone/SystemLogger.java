public class SystemLogger {
    private static SystemLogger instance;

    private SystemLogger() {
        System.out.println("System Login  ");
    }

    public static SystemLogger createObject() {
        if (instance == null) {
            instance = new SystemLogger();
        }
        return instance;
    }

    public static void main(String[] args) {
        SystemLogger CourseModule = SystemLogger.createObject();
        SystemLogger ExamModule = SystemLogger.createObject();

        System.out.println(CourseModule == ExamModule);
    }
}
