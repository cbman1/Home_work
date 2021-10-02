import java.util.Scanner;

public class N3 {
    public static boolean prime(long a) {
        if (a > 1) {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        if (prime(n)) {
            System.out.println("Prime");
        } else {
            for (int i = 1; i <= n; i++) {
                if (prime(i) && n % i == 0) {
                    if (i != 1) {
                        System.out.print(" * " + i);
                    } else {
                        System.out.print(i);
                    }
                    n = n / i;
                    i = 1;
                }
            }
        }
    }
}
