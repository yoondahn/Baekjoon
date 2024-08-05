import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        // 초기 입력값
        int a = x;
        int b = y;

        // 최대공약수
        while (y > 0) {
            int tmp = x;
            x = y;
            y = tmp % y;
        }
        int gcd = x;
        System.out.println(gcd);

        // 최소공배수(
        int lcm = (a * b) / gcd;
        System.out.println(lcm);

    }
}
