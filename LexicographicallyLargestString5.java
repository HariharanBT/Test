package test;

import java.util.Arrays;
import java.util.Scanner;

public class LexicographicallyLargestString5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int numStrings = scanner.nextInt();

        String[] strings = new String[numStrings];

        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter String" + (i + 1) + ": ");
            strings[i] = scanner.next();
        }

        findLexicographicallyLargestStrings(numStrings, strings);

        for (int i = 0; i < numStrings; i++) {
            System.out.println("String" + (i + 1) + ": " + strings[i]);
        }
    }

    public static void findLexicographicallyLargestStrings(int numStrings, String[] strings) {
        for (int i = 0; i < numStrings; i++) {
            char[] charArray = strings[i].toCharArray();
            Arrays.sort(charArray);
            strings[i] = new StringBuilder(new String(charArray)).reverse().toString();
        }
    }
}
