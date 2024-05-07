package homework;

public class GeometricShapes {

    // Method to calculate the area of a circle
    public static double calculateAreaCir(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate the area of a rectangle
    public static double calculateAreaRec(double length, double width) {
        return length * width;
    }

    // Method to calculate the lateral surface area of a cylinder
    public static double calculateAreaCyl(double radius, double height) {
        return 2 * Math.PI * radius * height;
    }

    public static void main(String[] args) {
        double radius = 4.0;
        double length = 4;
        double width = 7;
        double height = 5;

        // Calculate areas
        double areaOfCircle = calculateAreaCir(radius);
        double areaOfRectangle = calculateAreaRec(length, width);
        double areaOfCylinder = calculateAreaCyl(radius, height);

        // Print results
        System.out.println("Area of Circle: " + areaOfCircle);
        System.out.println("Area of Rectangle: " + areaOfRectangle);
        System.out.println("Area of Cylinder: " + areaOfCylinder);
    }
}
