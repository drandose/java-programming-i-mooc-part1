
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");

        int number2 = Integer.parseInt(scanner.nextLine());

        int result = number * number2;

        System.out.println(number + " * " + number2 + " = " + result);
        
        scanner.close();
    }
}
