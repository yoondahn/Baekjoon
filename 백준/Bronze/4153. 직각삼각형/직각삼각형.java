import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            if (a * a + b * b == c * c) {
                bw.write("right\n");
            } else if (b * b + c * c == a * a) {
                bw.write("right\n");
            } else if (c * c + a * a == b * b) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
            bw.flush();
        }
        br.close();
        bw.close();
    }
}