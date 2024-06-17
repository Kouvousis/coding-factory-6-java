package gr.aueb.cf.ch16.skeletal2;

public class Square extends AbstructRectangle implements ISquare {

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
    }
}
