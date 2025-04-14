// package domain;

public class Exercise {

    public static int Calculate(int day, int month, int year) {
        int sum = sumDigits(day) + sumDigits(month) + sumDigits(year);
        return reduceToSingleDigit(sum);
    }

    // Метод для підрахунку суми цифр числа
    private static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Метод для зведення до однозначного числа
    private static int reduceToSingleDigit(int number) {
        while (number > 9) {
            number = sumDigits(number);
        }
        return number;
    }
}
