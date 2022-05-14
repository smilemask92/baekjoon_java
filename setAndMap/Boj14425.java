package setAndMap;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Boj14425 {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("setAndMap/input14425.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int M = Integer.parseInt(line.split(" ")[1]);
        Set<String> set = new HashSet<String>();
        int i;
        for (i = 0; i < N; i++) {
            set.add(br.readLine().trim());
        }
        String word;
        int cnt = 0;
        for (i = 0; i < M; i++) {
            word = br.readLine();
            if (set.contains(word)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}