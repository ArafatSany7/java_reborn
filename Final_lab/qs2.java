interface Vehicle {
    void startEngine();
}

class car implements Vehicle {
    public void startEngine() {
        System.out.println("Car engine started");
    }
}

class bike implements Vehicle {
    public void startEngine() {
        System.out.println("Bike engine started");
    }
}

public class qs2 {
    public static void main(String[] args) {
        car car1 = new car();
        bike bike1 = new bike();
        car1.startEngine();
        bike1.startEngine();

    }
}
