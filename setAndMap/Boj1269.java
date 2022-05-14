package setAndMap;

import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Boj1269 {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("setAndMap/input1269.txt"));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        for (int ii = 0; ii < N; ii++) {
            set1.add(Integer.valueOf(sc.nextInt()));
        }
        Integer n;
        for (int ii = 0; ii < M; ii++) {
            n = Integer.valueOf(sc.nextInt());
            if (set1.contains(n)) {
                set1.remove(n);
            } else {
                set2.add(n);
            }
        }
        System.out.println(set1.size() + set2.size());
    }
}
