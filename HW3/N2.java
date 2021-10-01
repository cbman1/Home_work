import java.util.Scanner;
public class N2 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int k = In.nextInt();
        int m = In.nextInt();
        for (int i = k; i <= m; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
