import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int maxLength = 0;
        ArrayList<Integer> maxList = new ArrayList<>();

        for (int second = n/2; second <= n; second++) {
            ArrayList<Integer> currentList = numbers_continue(n, second);
            if (currentList.size() > maxLength) {
                maxList = new ArrayList<>(currentList);
                maxLength = currentList.size();
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(maxLength).append("\n");
        for (int i : maxList) {
            sb.append(i).append(" ");
        }
        System.out.print(sb);
    }

    public static ArrayList<Integer> numbers_continue(int n1, int n2) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);

        int next;
        for (int i = 0; i < list.size() - 1; i++) {
            next = list.get(i) - list.get(i+1);
            if (next < 0) break;
            else list.add(next);
        }
        return list;
    }
}