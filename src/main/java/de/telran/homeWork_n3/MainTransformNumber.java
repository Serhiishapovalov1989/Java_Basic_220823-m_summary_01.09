package de.telran.homeWork_n3;

import java.util.Scanner;

public class MainTransformNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первоначальную систему исчесления = ");
        int inNumbers = scanner.nextInt();

        System.out.println("Введите число = ");
        String inStr = scanner.next();
        long inStrNumber = Long.parseLong(inStr, inNumbers);

        System.out.println("В какую систему счисления преобразовать = ");
        int outNumbers = scanner.nextInt();

        System.out.println("Преобразованное число = " + Long.toString(inStrNumber, outNumbers));
    }
}
