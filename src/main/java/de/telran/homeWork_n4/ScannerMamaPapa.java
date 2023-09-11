package de.telran.homeWork_n4;

import java.util.Scanner;
public class ScannerMamaPapa {
    public static void main(String[] args) {
        String first, second;
        Scanner scanner = new Scanner(System.in);
        first = scanner.nextLine();
        second = scanner.nextLine();
        if (first.length() % 2 == 0 && second.length() % 2 == 0) {

            int firstHaf1 = first.length() / 2;
            String firstHaf2 = first.substring(0,firstHaf1);

            int secondHaf1 = second.length() / 2;
            String secondHaf2 = second.substring(0,secondHaf1);

            System.out.println(firstHaf2 + secondHaf2);
        } else {
            System.out.println("Одно из выведенных чисел не имеют четного количества букв");
        }
    }
}
