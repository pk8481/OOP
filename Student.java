import java.util.Scanner;

class Student {
    String USN, Name;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        USN = sc.nextLine();

        System.out.print("Enter Name: ");
        Name = sc.nextLine();
    }

    void display() {
        System.out.println("USN: " + USN);
        System.out.println("Name: " + Name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter details of Student 1:");
        s1.accept();

        System.out.println("Enter details of Student 2:");
        s2.accept();

        System.out.println("\nStudent Details:");

        s1.display();
        s2.display();
    }
}
