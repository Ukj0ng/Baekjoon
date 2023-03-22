import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner s = new Scanner(System.in);

        int time = s.nextInt();

        for (int i = 0; i < time; i++) {
            String str = s.next();
            char[] chars = str.toCharArray();

            Stack<Character> stack = new Stack<>();
            for (char c : chars) {
                if (stack.empty() || stack.peek() != c) stack.push(c);
                else stack.pop();
            }

            if (stack.empty()) cnt++;
        }

        System.out.println(cnt);
    }
}