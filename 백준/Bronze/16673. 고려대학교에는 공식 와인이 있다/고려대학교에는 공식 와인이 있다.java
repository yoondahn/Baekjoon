import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int sum = 0;
        for (int n = 1; n < C; n++) {
            sum += K * (C - n) + P * (Math.pow(C - n, 2));
        }
        sum += (K * C) + (P * Math.pow(C, 2));
        System.out.println(sum);
    }
}