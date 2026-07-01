import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock Quantity: ");
        int stock = sc.nextInt();

       
        Product p = new Product(id, name, price, stock);

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        p.applyDiscount(discount);

        System.out.println("\n----- Product Details -----");
        System.out.println("Product ID : " + p.getProductId());
        System.out.println("Product Name : " + p.getProductName());
        System.out.println("Price : " + p.getPrice());
        System.out.println("Stock Quantity : " + p.getStockQuantity());

        sc.close();
    }
}