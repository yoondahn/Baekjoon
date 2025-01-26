import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        boolean VPS = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(') {
                    stack.push(input.charAt(j));
                    VPS = false;
                } else {
                    if (stack.isEmpty()) {
                        VPS = false;
                        break;
                    }
                    stack.pop();
                    if (stack.isEmpty()) VPS = true;
                }
            }
            if (VPS) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.print(sb);
    }
}