import java.util.Scanner;

public class distancefinder {
    double x, y;

    public distancefinder(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.print("(" + x + ", " + y + ")\n");
    }

    public static double distancecalculator(distancefinder p1, distancefinder p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        distancefinder p1 = new distancefinder(x1, y1);

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        distancefinder p2 = new distancefinder(x2, y2);

        System.out.print("Point 1: ");
        p1.display();
        System.out.print("Point 2: ");
        p2.display();

        double distance = distancecalculator(p1, p2);
        System.out.println("Distance: " + distance);

        System.out.println("Yash Yadav 24csu241");

        sc.close();
    }
}
