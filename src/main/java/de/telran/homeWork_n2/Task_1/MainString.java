package de.telran.homeWork_n2.Task_1;

public class MainString {
    public static void main(String[] args) {
        String line = new String("I study Basic Java!");

        //___Расспечатать последний символ строки___//
        char lastChar = getLastChar(line);
        System.out.println("Предпоследний символ: " + lastChar);

        //___Проверка подстроки Java___//
        boolean containsJava = checkSubstring(line, "Java");
        System.out.println("Содержит подстроку 'Java': " + containsJava);

        //___Замена символов "а" > "о"___//
        String replacedStr = replaceCharacters(line, 'a', 'o');
        System.out.println("Замененная строка: " + replacedStr);

        //___Преобразование строки к верхнему регистру___//
        String uppercaseStr = toUpperCase(line);
        System.out.println("Строка в верхнем регистре: " + uppercaseStr);

        //___Преобразование строки к нижнему регистру___//
        String lowercaseStr = toLowerCase(line);
        System.out.println("Строка в нижнем регистре: " + lowercaseStr);

        //___Вырезать строку "Java"___//
        String substring = extractSubstring(line, "Java");
        System.out.println("Вырезанная подстрока: " + substring);
    }

    //___Метод расспечатывания последнего символа___//
    public static char getLastChar(String line) {
        int lastIndex = line.length() - 2;
        return line.charAt(lastIndex);
    }

    //___Метод проверки подстроки___//
    public static boolean checkSubstring(String line, String substring) {
        return line.contains(substring);
    }

    //___Метод замены символов___//
    public static String replaceCharacters(String line, char oldChar, char newChar) {
        return line.replace(oldChar, newChar);
    }

    //___Метод преобразования к верхнему регистру___//
    public static String toUpperCase(String line) {
        return line.toUpperCase();
    }

    //___Метод преобразования к нижнему регистру___//
    public static String toLowerCase(String line) {
        return line.toLowerCase();
    }

    //___Метод вырезания "Java"___//
    public static String extractSubstring(String line, String substring) {
        int startIndex = line.indexOf(substring);
        int endIndex = startIndex + substring.length();
        return line.substring(startIndex, endIndex);
    }
}
