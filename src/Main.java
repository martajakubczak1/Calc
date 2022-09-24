import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator kalkulator1 = new Calculator();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first value");
        int value1 = scanner.nextInt();
        System.out.println("Enter second value");
        int value2 = scanner.nextInt();
        System.out.println(kalkulator1.addition(value1, value2));

    }

}