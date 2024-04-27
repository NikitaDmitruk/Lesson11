package TaskWIthStar;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        if (scanner.hasNext()) {
            String[] words = scanner.nextLine().split("\\W");
            System.out.println(Arrays.toString(words));
            System.out.println("Для проверки слова на палнидром, введите целое число, равное номеру слова в строке: ");
            if (scanner.hasNextInt()) {
                int wordNumber = scanner.nextInt() - 1;
                if (wordNumber <= words.length) {
                    StringBuilder newWord = new StringBuilder(words[wordNumber].replaceAll(" +", ""));
                    if (newWord.reverse() == newWord) {
                        System.out.println("'" + newWord + "' палиндром!");
                    } else {
                        System.out.println("'" + newWord + "' не палиндром!");
                    }
                } else {
                    System.out.println("В этой строке меньше слов!");
                }
            }
            System.out.println("Вы ввели не целое число!");
        } else {
            System.out.println("Вы ввели не строку!");
        }
    }
}
