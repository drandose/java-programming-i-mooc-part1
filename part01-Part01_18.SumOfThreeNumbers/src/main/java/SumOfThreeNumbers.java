
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");

        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");

        int number3 = Integer.parseInt(scanner.nextLine());

        int result = number + number2 + number3;

        System.out.println("The sum of the numbers is " + result);

        scanner.close();
    }
}
