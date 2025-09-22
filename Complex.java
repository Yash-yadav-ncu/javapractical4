import java.util.Scanner;

public class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imag + c2.imag);
    }

    public static Complex subtract(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.imag - c2.imag);
    }

    public static Complex multiply(Complex c1, Complex c2) {
        int r = c1.real * c2.real - c1.imag * c2.imag;
        int i = c1.real * c2.imag + c1.imag * c2.real;
        return new Complex(r, i);
    }

    public void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary part of first complex number: ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

        System.out.print("Enter real and imaginary part of second complex number: ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

        Complex sum = Complex.add(c1, c2);
        Complex diff = Complex.subtract(c1, c2);
        Complex prod = Complex.multiply(c1, c2);

        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        diff.display();
        System.out.print("Product: ");
        prod.display();

        System.out.println("Yash Yadav 24csu241");

        sc.close();
    }
}
