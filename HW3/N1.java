import java.util.Scanner;

public class N1 {
    static long factorial(int a) {
        long rez = 1;
            for (int i = 1; i <= a; i++) {
                rez *= i;
        } return rez;
    }

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int a = In.nextInt();
        System.out.println(factorial(a));
    }
}
