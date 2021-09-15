// 2. Пользователь вводит числа, в конце вводит 0. Вывести сумму

import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Введите число - ");
            int numbers = scanner.nextInt();
            if (numbers == 0) {
                break;
            }
            sum += numbers;
        }
        System.out.println("Сумма введеных чисел - " + sum);
    }
}
