package gr.aueb.cf.ch16.shapes;

public class Shape {
    private enum Type { RECTANGLE, CIRCLE}

    // Tag field.
    private final Type type;

    // Fields for Rectangle.
    private double height;
    private double width;

    // Private fields for Circle.
    private double radius;

    // Constructor of Rectangle.
    public Shape(double height, double width) {
        type = Type.RECTANGLE;
        this.height = height;
        this.width = width;
    }

    // Constructor for Circle.
    public Shape(double radius) {
        type = Type.CIRCLE;
        this.radius = radius;
    }

    public double getArea() {
        switch (type) {
            case CIRCLE:
                return Math.PI * Math.pow(radius, 2);
            case RECTANGLE:
                return width * height;
            default:
                throw new RuntimeException("Error");
        }
    }
}
