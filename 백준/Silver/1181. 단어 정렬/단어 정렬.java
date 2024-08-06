import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        br.close();

        Arrays.sort(arr);
        Arrays.sort(arr, (String s1, String s2) -> s1.length() - s2.length());

        List<String> result = new ArrayList<>();
        result.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (!arr[i].equals(arr[i-1])) result.add(arr[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (String s : result) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
