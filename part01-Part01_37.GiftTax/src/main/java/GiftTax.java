
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift?");

        int gift = Integer.parseInt(scanner.nextLine());

        double tax = (double) (100 + (gift - 5000) * 0.08);
        double tax2 = (double) (1700 + (gift - 25000) * 0.10);
        double tax3 = (double) (4700 + (gift - 55000) * 0.12);
        double tax4 = (double) (22100 + (gift - 200000) * 0.15);
        double tax5 = (double) (142100 + (gift - 1000000) * 0.17);

        if (gift >= 5000 && gift < 25000) {
            System.out.println("The tax is " + tax);
        } else if (gift >= 25000 && gift < 55000) {
            System.out.println("The tax is " + tax2);
        } else if (gift >= 55000 && gift < 200000) {
            System.out.println("The tax is " + tax3);
        } else if (gift >= 200000 && gift < 1000000) {
            System.out.println("The tax is " + tax4);
        } else if (gift >= 1000000) {
            System.out.println("The tax is " + tax5);
        } else {
            System.out.println("No tax!");
        }

        scanner.close();
    }
}