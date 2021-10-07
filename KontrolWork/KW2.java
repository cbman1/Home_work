import java.util.Scanner;
public class KW2 {
    static boolean CheckChet(int a) {
        boolean flag = true;
        while (a > 0) {
            flag &= ((a % 10) % 2 == 0); {
                a /= 10;

            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean answer = false;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            answer |= CheckChet(a);
        }
        if (answer) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
