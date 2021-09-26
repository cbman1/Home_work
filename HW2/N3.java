import java.util.Scanner;
public class N3 {
    public static boolean CheckTreug(int a, int b, int c) {
        if ((a+b > c) && (a+c > b) && (b+c > a)) {
            return true;
        } return false;
    }

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int a = In.nextInt();
        int b = In.nextInt();
        int c = In.nextInt();
        if (CheckTreug(a,b,c)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
