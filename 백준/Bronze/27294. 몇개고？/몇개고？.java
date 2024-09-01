import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        br.close();

        if (s == 1 || t <= 11 || t > 16) System.out.println(280);
        else if (t >= 12 && t <= 16 && s == 0) System.out.println(320);
    }
}
