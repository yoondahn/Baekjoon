import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] tshirtArr = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < tshirtArr.length; i++) {
            tshirtArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        br.close();

        int tshirt = 0;
        for (int i = 0; i < tshirtArr.length; i++) {
            tshirt += (tshirtArr[i] + t - 1) / t;
        }

        int pen = n / p;
        int pen1 = n % p;

        StringBuilder sb = new StringBuilder();
        sb.append(tshirt).append("\n");
        sb.append(pen).append(" ").append(pen1);
        System.out.println(sb);
    }
}
