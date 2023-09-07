package de.telran.homeWork_n2.Task_2;

import java.util.Scanner;

import static de.telran.homeWork_n2.Task_2.Deviding.Dev;
import static de.telran.homeWork_n2.Task_2.Minus.Dedaction;
import static de.telran.homeWork_n2.Task_2.Multipliing.Mult;
import static de.telran.homeWork_n2.Task_2.Summ.Summa;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write your first number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Write your second number: ");
        int secondNum = scanner.nextInt();

        int sumResult = Summa(firstNum, secondNum);

        System.out.println("Sum result ist " + sumResult);

        System.out.println("Deviding result is " + Dev(firstNum, secondNum));

        System.out.println("Dedacting result is " + Dedaction(firstNum, secondNum));

        System.out.println("Multipliing result is " + Mult(firstNum, secondNum));
    }
}
