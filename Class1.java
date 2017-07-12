abstract class Class1 {
    private final double PI = Math.PI;

    public double getSquare(double radius) {
        return PI * radius * radius;
    }

    public double getSquare(double a, double b) {
        return a * b;
    }

    public String getColor() {
        return "Black";
    }
}