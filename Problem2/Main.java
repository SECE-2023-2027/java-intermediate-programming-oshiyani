import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Mark " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student s = new Student(name, marks);

        System.out.println("Average Marks = " + s.calculateAverage());

        sc.close();
    }
}