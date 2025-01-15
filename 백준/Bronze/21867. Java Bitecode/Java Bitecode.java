import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();

        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(String.valueOf(s.charAt(i)));
        }

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String result = iterator.next();
            if (result.equals("J") || result.equals("A") || result.equals("V")) {
                iterator.remove();
            }
        }
        if (linkedList.isEmpty()) sb.append("nojava");
        else {
            for (String bc : linkedList) {
                sb.append(bc);
            }
        }
        System.out.println(sb);
    }
}