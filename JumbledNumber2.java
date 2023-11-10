package test;
import java.util.Scanner;

public class JumbledNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int a = scanner.nextInt();
        int count = 0;
        int num = a;

        while (num / 10 != 0) {
            count++;
            num = num / 10;
        }
        int[] b = new int[count + 1];
        num = a; 
        for (int i = 0; i <= count; i++) {
            b[i] = num % 10;
            num = num / 10;
        }

        boolean d = true;
        for (int i = 0; i < count; i++) {
            if (Math.abs(b[i] - b[i + 1]) != 1) {
                d = false;
                break;
            }
        }

        if (d) {
            System.out.println("It's a jumbled number.");
        } else {
            System.out.println("It's not a jumbled number.");
        }
    }
}
