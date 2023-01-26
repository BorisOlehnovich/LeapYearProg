import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год, если хотите завершить программу введите: 0");

        while (true) {
            int year = scanner.nextInt();
            if (year == 0) {
                break;
            }
            if (isLeapYear(year)) {
                System.out.println(year + " Высокосный год");
            } else {
                System.out.println(year + " Этот год не высокосный");
            }
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0){
            return true;
        } else {
            return false;
        }
    }
}
