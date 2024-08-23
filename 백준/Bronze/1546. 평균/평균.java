import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        double[] score = new double[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        Arrays.sort(score);
        double max = score[score.length - 1];

        double mean = 0;
        for (int i = 0; i < n; i++) {
            score[i] = score[i] / max * 100;
            mean += score[i];
        }
        mean /= n;

        StringBuilder sb = new StringBuilder();
        sb.append(mean);
        System.out.println(sb);
    }
}
