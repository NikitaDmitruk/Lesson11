package TaskOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phrases = new String[3];
        String buf;
        System.out.println("Введите поочереди три строки:");
        for (int i = 0; i < phrases.length; i++) {
            if (scanner.hasNext()) {
                phrases[i] = scanner.next();
            } else {
                System.out.println("Вы ввели не строку!");
                return;
            }
        }
        int max = phrases[0].length();
        int min = phrases[0].length();
        for (String phrase : phrases) {
            if (phrase.length() >= max) {
                max = phrase.length();
            }
            if (phrase.length() <= min) {
                min = phrase.length();
            }
        }
        for (String phrase : phrases) {
            if (phrase.length() == max) {
                System.out.println("Самая длинная строка и ее длина: '" + phrase + "', количество символов " + max);
                continue;
            }
            if (phrase.length() == min) {
                System.out.println("Самая короткая строка и ее длина: '" + phrase + "', количество символов " + min);
            }
        }
        for (int i = 0; i < phrases.length; i++) {
            for (int j = i; j < phrases.length; j++) {
                if (phrases[j].length() < phrases[i].length()) {
                    buf = phrases[i];
                    phrases[i] = phrases[j];
                    phrases[j] = buf;
                }
            }
            System.out.print(phrases[i] + " ");
        }
        if (phrases[0].length() < phrases[1].length()) {
            System.out.println("\nСтрока, длина которой меньше средней, и ее длина: '" + phrases[0] +
                               "', количество символов " + phrases[0].length());
        } else {
            System.out.println("\nСтроки длиной меньше чем средняя отсуствуют!");
        }
        System.out.println("Введите поочереди три строки:");
        for (int i = 0; i < phrases.length; i++) {
            if (scanner.hasNext()) {
                phrases[i] = scanner.next();
            } else {
                System.out.println("Вы ввели не строку!");
                return;
            }
        }
        for (String phrase : phrases) {
            char[] charArray = phrase.toCharArray();
            boolean check = true;
            for (int j = 1; j < charArray.length; j++) {
                if (charArray[0] == charArray[j]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Первое слово, состоящее из различных символов: '" + phrase + "'");
                break;
            }
        }
        System.out.println("Введите строку: ");
        if (scanner.hasNext()) {
            char[] charArray = scanner.next().toCharArray();
            StringBuilder newWord = new StringBuilder();
            for (char letter : charArray) {
                newWord.append(letter).append(letter);
            }
            System.out.println(newWord);
        } else {
            System.out.println("Вы ввели не строку!");
        }
    }
}