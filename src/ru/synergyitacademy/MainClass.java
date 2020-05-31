package ru.synergyitacademy;
import java.util.Scanner;
public class MainClass {
    public static int fibonacci(int number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index of Fibbonachi array:");
        while (scanner.hasNext()) {
            String value = scanner.nextLine();
            if ("exit".equals(value)) {
                break;
            }
            Integer n = Integer.decode(value);
            for (int counter = 1; counter <= n; counter++) {
                System.out.printf("Fibonacci of %d is: %d\n",
                        counter, fibonacci(counter));
            }
        }


    }
}