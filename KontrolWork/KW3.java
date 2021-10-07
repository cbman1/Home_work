import java.util.Scanner;

public class KW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] answer_cnt = new int[11];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            answer_cnt[a]++;
        }
        for (int i = 0; i < 11; i++) {
            if (answer_cnt[i] == 0) continue;
            System.out.println(i + ": " + answer_cnt[i] + " times");
        }
    }
}
