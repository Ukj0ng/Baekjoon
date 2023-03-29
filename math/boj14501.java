import java.util.Scanner;

public class boj14501 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[][] arr = new int[n][2];
        int[] dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i][0] = s.nextInt();        // during day
            arr[i][1] = s.nextInt();        // getting reward
        }

        for (int i = 0; i < n; i++) {

            if (i + arr[i][0] <= n) dp[i + arr[i][0]] = Math.max(dp[i + arr[i][0]], dp[i] + arr[i][1]);

            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
            print(dp);
        }

    }

    static void print(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}