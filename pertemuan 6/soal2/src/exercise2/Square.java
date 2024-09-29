package exercise2;

public class Square extends Rectangle {

    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setSide(double side) {
        setLength(side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public String toString() {
        return "Square [side=" + getWidth() + "] Subclass of: " + super.toString();
    }
}
