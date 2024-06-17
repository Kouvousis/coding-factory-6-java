package gr.aueb.cf.ch16.skeletal2;

public abstract class AbstructRectangle implements IRectangle {

    private double width;
    private double height;

    public AbstructRectangle() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public boolean isSquare() {
        return width == height;
    }
}
