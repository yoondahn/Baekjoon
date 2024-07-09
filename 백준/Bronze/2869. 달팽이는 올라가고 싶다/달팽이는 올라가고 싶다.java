import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        br.close();

        int dayDist = a - b;
        int goalDist = v - b;

        if (goalDist % dayDist != 0) { bw.write(String.valueOf(goalDist / dayDist + 1)); }
        else { bw.write(String.valueOf(goalDist / dayDist)); }

        bw.flush();
        bw.close();
    }
}