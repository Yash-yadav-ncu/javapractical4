public class Triangle {
    int a, b, c;

    public Triangle() {
        a = 3;
        b = 4;
        c = 5;
    }

    public double Perimeter() {
        return a + b + c;
    }

    public double Area() {
        double s = Perimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Triangle triagnle1 = new Triangle();
        System.out.println("Area: " + triagnle1.Area());
        System.out.println("Perimeter: " + triagnle1.Perimeter());
        System.out.println("Yash Yadav 24csu241");
    }
}
