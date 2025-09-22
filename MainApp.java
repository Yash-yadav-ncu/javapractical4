import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();
        Point p1 = new Point(x1, y1);

        System.out.print("Enter x2 and y2: ");
        float x2 = scanner.nextFloat();
        float y2 = scanner.nextFloat();
        Point p2 = new Point(x2, y2);

        System.out.print("Point 1: ");
        p1.display();

        System.out.print("Point 2: ");
        p2.display();

        double dist = Point.distance(p1, p2);
        System.out.printf("Distance between the two points: %.2f%n", dist);

        scanner.close();
    }
}
