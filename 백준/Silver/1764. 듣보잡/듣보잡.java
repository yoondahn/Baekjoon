import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> personSet  = new HashSet<>();
        for (int i = 0; i < n; i++) {
            personSet.add(br.readLine());
        }

        HashSet<String> resultSet = new HashSet<>();
        for (int i = 0; i < m; i++) {
            String notSeen = br.readLine();
            if (personSet.contains(notSeen)) {
                resultSet.add(notSeen);
            }
        }
        br.close();

        ArrayList<String> list = new ArrayList<>(resultSet);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
