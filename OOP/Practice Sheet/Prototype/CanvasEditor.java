interface shape {
    shape clone();
}

class Circle implements shape {
    String draw, art;
    int angle, cordinate;

    public Circle(String darw, String art, int angle, int cordinate) {
        this.draw = draw;
        this.art = art;
        this.angle = angle;
        this.cordinate = cordinate;
    }

    public shape clone() {
        return new Circle(this.draw, this.art, this.angle, this.cordinate);
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public void setCordinate(int cordinate) {
        this.cordinate = cordinate;
    }

    public void info() {
        System.out.println(
                "This is " + draw + "Arted By " + art + "Using angle " + angle + "With a cordinate of " + cordinate);
    }
}

public class CanvasEditor {
    public static void main(String[] args) {
        shape protoShape = new Circle("Circle", "Soft", 0, 0);

        Circle c1 = (Circle) protoShape.clone();

        c1.setAngle(30);
        c1.setCordinate(90);

        c1.info();
    }
}
