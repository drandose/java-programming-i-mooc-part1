import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = 24;
        int minutes = 60;
        int seconds = 60;

        System.out.println("How many days would you like to convert to seconds?");

        int number = Integer.parseInt(scanner.nextLine());

        int convertion = number * (hours * minutes * seconds);

        System.out.println(convertion);

        scanner.close();
    }
}
