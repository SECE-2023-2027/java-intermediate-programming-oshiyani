import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Vehicle");
        System.out.println("1. Car");
        System.out.println("2. Motorcycle");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Car();
        } else {
            vehicle = new Motorcycle();
        }

        System.out.println(vehicle.startEngine());

        sc.close();
    }
}