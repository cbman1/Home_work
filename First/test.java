import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        System.out.print("Введите номер месяца: " );
        Scanner Number_month = new Scanner(System.in);
        int number = Number_month.nextInt();
        if (number == 1 || number == 2 || number == 12) {
            System.out.println("это Зима");
        } else if (number == 3 || number == 4 || number == 5) {
            System.out.println("это Весна");
        } else if (number == 6 || number == 7 || number == 8) {
            System.out.println("это Лето");
        } else if (number == 9 || number == 10 || number == 11) {
            System.out.println("это Осень");
        }

    }
}
