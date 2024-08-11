import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            if (k > m) continue;
            int empty = 0;

            for (int j = 0; j < k; j++) {
                if (row.charAt(j) == '0') empty++;
            }
            if (empty == k) result++;

            for (int j = k; j < m; j++) {
                if (row.charAt(j) == '0') empty++;
                if (row.charAt(j - k) == '0') empty--;
                if (empty == k) result++;
            }
        }
        System.out.println(result);
    }
}
