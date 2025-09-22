import java.util.Scanner;

public class Area {
    int length;
    int breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        Area a = new Area(length, breadth);
        System.out.println("Area: " + a.returnArea());
        System.out.println("Yash Yadav 24csu241");
        sc.close();
    }
}
