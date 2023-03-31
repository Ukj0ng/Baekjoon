import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2775 {

    static final int N = 15;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] dp = new int[N][N];

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < N; i++) {
            dp[0][i] = i;
            dp[i][1] = 1;
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }

        while (n-- > 0) {
            int i = Integer.parseInt(br.readLine());
            int j = Integer.parseInt(br.readLine());

            sb.append(dp[i][j] + "\n");
        }

        System.out.println(sb);
    }
}