public class SpaceMain {
    public static void main(String[] args) {
        System.out.println("Площадь планеты Земля - " + MathUtils.calculateSurfaceArea(6371));
        System.out.println("Радиус планеты Земля - " + MathUtils.calculateEquatorLength(6371));
        System.out.println("Число Пи - " + MathUtils.PI);
    }
}
