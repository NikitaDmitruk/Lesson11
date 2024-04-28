package TaskWIthStar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        if (scanner.hasNext()) {
            String[] words = scanner.nextLine().split("[,. !?_–]+");
            for (String a:words) {
                System.out.println(a);
            }
            System.out.println("Для проверки слова на палнидром, введите целое число, равное номеру слова в строке: ");
            if (scanner.hasNextInt()) {
                int wordNumber = scanner.nextInt() - 1;
                if (wordNumber <= words.length) {
                    StringBuilder newWord = new StringBuilder(words[wordNumber].trim());
                    if(words[wordNumber].trim().equalsIgnoreCase(String.valueOf(newWord.reverse()))) {
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
        } else {
            System.out.println("Вы ввели не строку!");
        }
    }
}
