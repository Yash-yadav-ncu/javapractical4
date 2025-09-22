public class Student {
    String name;
    int roll_no;

    public Student() {
        name = "John";
        roll_no = 2;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        System.out.println("Yash Yadav 24csu241");
    }
}
