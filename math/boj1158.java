import java.util.LinkedList;
import java.util.Scanner;

public class boj1158 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();
        int index = k - 1;

        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            ll.add(i);
        }

        while (!ll.isEmpty()) {
            if (index > ll.size() - 1) {
                index %= ll.size();
            }

            sb.append(ll.get(index) + ", ");
            ll.remove(index);
            index += k - 1;
        }

        sb.delete(sb.length() - 1, sb.length());
        sb.delete(sb.length() - 1, sb.length());
        sb.append(">");
        System.out.println(sb);
    }

}