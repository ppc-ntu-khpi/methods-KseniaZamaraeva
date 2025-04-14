// package test;

import java.util.Scanner;
// import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть день народження (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Введіть місяць народження (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Введіть рік народження (напр. 1998): ");
        int year = scanner.nextInt();

        int destinyNumber = Exercise.Calculate(day, month, year);

        System.out.println("Число долі для дати " + day + "." + month + "." + year + " є: " + destinyNumber);
    }
}
