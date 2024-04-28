package TaskWIthStar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        //В 11 строке есть вопрос. Не работает regex [\\W_]+ для русского шрифта. Для латиницы работает.
        String[] words = scanner.nextLine().split("[,. !?_–:-]+");
        System.out.println("Для проверки слова на палнидром, введите целое число (начало с 1)" +
                           ", равное номеру слова в строке: ");
        if (scanner.hasNextInt()) {
            int wordNumber = scanner.nextInt() - 1;
            if (wordNumber < words.length) {
                StringBuilder newWord = new StringBuilder(words[wordNumber]);
                if (words[wordNumber].trim().equalsIgnoreCase(String.valueOf(newWord.reverse()))) {
                    System.out.println("'" + words[wordNumber] + "' палиндром!");
                } else {
                    System.out.println("'" + words[wordNumber] + "' не палиндром!");
                }
            } else {
                System.out.println("В этой строке меньше слов!");
            }
        } else {
            System.out.println("Вы ввели не целое число!");
        }
    }
}
