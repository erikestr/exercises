public class TriangleArea {

    public static void main(String[] args) {
        System.out.printf("Calculate triangle(5cm,3cm,6cm): " + area(5,3,6, "cm") );
    }

    public static String area(double a, double b, double c, String unitOfMeasurement) {
        double s = (a + b + c) / 2;
        Double area = Math.sqrt((s * (s - a)) * (s - b) * (s - c));

        return "Area of triangle("+a+unitOfMeasurement+", "+b+unitOfMeasurement+", "+c+unitOfMeasurement+"): " +
                String.format("%.2f", area) + unitOfMeasurement;
    }
}
