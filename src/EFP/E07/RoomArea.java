package EFP.E07;

public class RoomArea {
    private final double length;
    private final double width;
    private final double feetToMetersMultiplier = 0.09290304;

    public RoomArea(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private double area(){
        return length * width;
    }

    public double squareFeet() {
        return area();
    }

    public double squareMeters() {
        double area = area();
        return area * feetToMetersMultiplier;
    }
}
