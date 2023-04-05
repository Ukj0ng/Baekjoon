import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] wv = new int[n][2];
        int[] dp = new int[k + 1];

        for (int i = 0; i < wv.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            wv[i][0] = Integer.parseInt(st.nextToken());        // weight
            wv[i][1] = Integer.parseInt(st.nextToken());        // value
        }

        for (int i = 0; i < wv.length; i++) {
            for (int j = k; j - wv[i][0] >= 0; j--) {
                dp[j] = Math.max(dp[j], dp[j - wv[i][0]] + wv[i][1]);
            }
        }

        for (int i = 0; i < dp.length; i++) System.out.print(dp[i] + " ");
        System.out.println();
    }
}