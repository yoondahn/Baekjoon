import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        br.close();
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) { return false; }
        if (n == 2) { return true; }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { return false; }
        }
        return true;
    }
}