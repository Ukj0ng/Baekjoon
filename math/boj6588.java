import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int[] LUT = new int[1000000];

        setLUT(LUT);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int input = Integer.parseInt(bf.readLine());
            if (input == 0) break;
            sb.append(goldbach(LUT, input)).append("\n");
        }

        System.out.println(sb.toString());
    }


    private static String goldbach(int[] LUT, int n) {
        for (int i = 3; i <= n / 2; i+=2) {
            int a = n - i;

            if (LUT[i] == 0 && LUT[a] == 0 && i + a == n) return n + " = " + i + " + " + a;
        }

        return "Goldbach's conjecture is wrong.";
    }

    private static void setLUT(int[] LUT) {
        for (int i = 3; i * i < LUT.length; i+=2) {
            if (LUT[i] == 0) {
                for (int j = i * i; j < LUT.length; j+=i) LUT[j] = 1;
            }
        }
    }

}