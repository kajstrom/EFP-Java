package fi.kajstrom.EFP.E09;

public class AreaPaintCalculator {
    private static double sqFeetPerGallon = 350;
    private final int length;
    private final int width;

    public AreaPaintCalculator(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int amountOfPaint() {
        return (int)Math.ceil(area() / sqFeetPerGallon);
    }
}
