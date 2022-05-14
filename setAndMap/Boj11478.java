package setAndMap;

import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Boj11478 {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("setAndMap/input11478.txt"));
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int l = line.length();
        int jj = 0;
        Set<String> set = new HashSet();
        for (int kk = 0; kk < l; kk++) {
            jj++;
            for (int ii = 0; ii <= l - jj; ii++) {
                set.add(line.substring(ii, ii + jj));
            }
        }
        System.out.println(set.size());
    }
}
