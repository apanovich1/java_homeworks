/*Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
*/
import java.util.regex.*;
public class StringProcessing {
    private String inputString;

    public StringProcessing(String input) {

        this.inputString = input;
    }
    //Вывести на экран в одну строку два первых блока по 4 цифры
    public static void GetNumbers(String inputString) {
        String[] blocks = inputString.split("-");

        StringBuilder result = new StringBuilder();

        for (String block : blocks) {
            if (block.length() == 4 && block.matches("\\d+")) {
                result.append(block).append(" ");
            }
        }

        // Remove the trailing space and return the result
        System.out.println(result.toString().trim());
    }
//Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
    public static void LetterReplace(String inputString) {
        String replaceString = inputString.replaceAll("[a-zA-Z]", "*");
        System.out.println(replaceString);
    }
//Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
    public static void GetLetters(String inputString) {
        String replacedString = inputString.replaceAll("[^a-zA-Z]+", " ");
        replacedString = replacedString.trim(); // Remove leading and trailing spaces

        String[] words = replacedString.split(" ");

        StringBuilder formattedString = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            formattedString.append(words[i]);

            if (i < words.length - 1) {
                formattedString.append("/");
            }
        }

        System.out.println(formattedString.toString().toLowerCase());
    }
//Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
    public static void GetLettersUpper(String inputString) {
        String replacedString = inputString.replaceAll("[^a-zA-Z]+", " ");
        replacedString = replacedString.trim(); // Remove leading and trailing spaces

        String[] words = replacedString.split(" ");

        StringBuilder formattedString = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            formattedString.append(words[i]);

            if (i < words.length - 1) {
                formattedString.append("/");
            }
        }

        System.out.println("Letters: " + formattedString.toString().toUpperCase());
    }
    //Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
    public static void ContainABC(String inputString){
        System.out.println(inputString.contains("abc")||inputString.contains("ABC"));
    }
    //Проверить начинается ли номер документа с последовательности 555.
    public static void StartWithNumbersFive(String inputString) {
        System.out.println(inputString.startsWith("555"));
    }
    //Проверить заканчивается ли номер документа на последовательность 1a2b.
    public static void EndWithLettersAndNumbers(String inputString) {
        System.out.println(inputString.endsWith("1a2b"));
    }
}