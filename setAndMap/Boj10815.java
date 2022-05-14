package setAndMap;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Boj10815 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("setAndMap/input10815.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> set = new HashSet();
        for (int ii = 0; ii < N; ii++) {
            set.add(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int ii = 0; ii < M; ii++) {
            String temp = st.nextToken();
            if (set.contains(temp)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb.toString());
    }
}
