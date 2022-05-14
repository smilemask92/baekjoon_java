package priorityQue;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Boj11279 {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("priorityQue/input11279.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        Integer n;
        while (s != null) {
            n = Integer.parseInt(s);
            if (n == 0) {
                if (pq.size() == 0) {
                    bw.write("0 \n");
                } else {
                    bw.write(pq.poll() + "\n");
                }
            } else {
                pq.add(n);
            }
            s = br.readLine();
        }
        bw.flush();
        bw.close();
    }
}
