public class MathUtils {
    public static final double PI = 3.1415;

    public static double calculateSurfaceArea(double radius) {
        return 4 * PI * (radius * radius);
    }

    public static double calculateEquatorLength(double radius) {
        return 2 * PI * radius;
    }
}
