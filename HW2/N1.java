import java.util.Scanner;
public class N1 {
    public static boolean prime(int a) {
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
        Scanner In = new Scanner(System.in);
        int a = In.nextInt();
        if (prime(a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
