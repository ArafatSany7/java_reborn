interface Player {
    Player clone();
}

class Striker implements Player {
    private String coordinate;
    private int number;

    public Striker(String coordinate, int number) {
        this.coordinate = coordinate;
        this.number = number;
    }

    @Override
    public Player clone() {
        return new Striker(this.coordinate, this.number);
    }

    public void setCoordinate(String s) {
        this.coordinate = s;
    }

    public void setNumber(int n) {
        this.number = n;
    }

    public void display() {
        System.out.println(
                "Player is a Striker and his position is " + coordinate + " and his jersye number is " + number);
    }
}

class Defender implements Player {
    private String coordinate;
    private int number;

    public Defender(String coordinate, int number) {
        this.coordinate = coordinate;
        this.number = number;
    }

    @Override
    public Player clone() {
        return new Defender(this.coordinate, this.number);
    }

    public void setCoordinate(String s) {
        this.coordinate = s;
    }

    public void setNumber(int n) {
        this.number = n;
    }

    public void display() {
        System.out.println(
                "Player is a Defender and his position is " + coordinate + " and his jersye number is " + number);
    }
}

public class TrainingGround {
    public static void main(String[] args) {
        Player basPlayer2 = new Defender("Coordinate", 0);

        ((Defender) basPlayer2).display();

        Defender player1 = (Defender) basPlayer2.clone();
        player1.setCoordinate("CB");
        player1.setNumber(4);

        player1.display();

    }
}
