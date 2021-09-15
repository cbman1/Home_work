
// 1. Пользователь вводит числа, в конце вводит 0. Вывести да, если среди чисел есть 5, иначе нет

import java.util.Scanner;
public class N1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while (true) {
            System.out.print("Введите число: ");
            int numbers = scanner.nextInt();
            if (numbers == 0) {
                break;
            }
            if (numbers == 5) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
