interface CollectionVehicle {
    String startCollection(String Collection);
}

class OrgannicTruck implements CollectionVehicle {
    public String startCollection(String s) {
        return "Waste Collected via " + s;
    }
}

class RecyclingVan implements CollectionVehicle {
    public String startCollection(String s) {
        return "Waste collected via " + s;
    }
}

class VehicleFactory {
    public static CollectionVehicle create(String method) {
        return switch (method) {
            case "Truck" -> new OrgannicTruck();
            case "Van" -> new RecyclingVan();
            default -> throw new IllegalArgumentException(method);
        };
    }
}

public class WasteWise {
    public static void main(String[] args) {
        CollectionVehicle vehicle = VehicleFactory.create("Truck");
        CollectionVehicle van = VehicleFactory.create("Van");

        System.out.println(van.startCollection("Van"));
        System.out.println(vehicle.startCollection("Truck"));
    }
}
