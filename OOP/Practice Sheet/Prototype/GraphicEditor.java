
interface Shape {
    Shape clone();
}

class Circle implements Shape {
    private String color;
    private int size;

    public Circle(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public Shape clone() {
        return new Circle(this.color, this.size);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void display() {
        System.out.println("Circle color " + color + "And radius " + size);
    }
}

class Rectangle implements Shape {
    private String color;
    private int size;

    public Rectangle(String color, int size) {
        this.color = color;
        this.size = size;

    }

    @Override
    public Shape clone() {
        return new Rectangle(this.color, this.size);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void display() {
        System.out.println("Circle color " + color + "And radius " + size);
    }
}

public class GraphicEditor {
    public static void main(String[] args) {

        Circle originalCircle = new Circle("Red", 9);

        originalCircle.display();

        Circle duplicateCircle = (Circle) originalCircle.clone();
        duplicateCircle.setColor("Green");
        duplicateCircle.setSize(95);

        duplicateCircle.display();
    }
}
