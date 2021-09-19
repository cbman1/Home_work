// Вводится последовательность целых чисел, ввод завершается 0.

import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prev = in.nextInt();
        boolean flag = false;
        boolean flag2 = false;
        boolean flag3 = false;
        int count1 = 0; // <
        int count2 = 0; // >
        while (true) {
            int numbers = in.nextInt();
            if (prev == 0 || numbers == 0) {
                break;
            }
            if (prev < numbers) {
                flag = true;
                count1++;
            } else if (prev > numbers) {
                flag2 = true;
                count2++;
            } else if (prev == numbers) {
                flag3 = true;
            }
            prev = numbers;
        } if (flag && flag2) {
            System.out.println("!");
        } else if (count2 == 0 && flag) {
            System.out.print("<");
        } else if (count1 == 0 && flag2) {
            System.out.println(">");
        } else if (count1 == 0 && count2 == 0 && flag3) {
            System.out.println("=");
        }
    }
}
