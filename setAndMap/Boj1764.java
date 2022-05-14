package setAndMap;

import java.io.*;
import java.util.*;

public class Boj1764 {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("setAndMap/input1764.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String numbers = br.readLine();
        int N = Integer.parseInt(numbers.split(" ")[0]);
        int M = Integer.parseInt(numbers.split(" ")[1]);
        Set<String> set = new HashSet();
        for (int ii=0;ii<N;ii++){
            set.add(br.readLine());
        }
        PriorityQueue<String> pq = new PriorityQueue<>();
        String unseen;
        for (int ii=0;ii<M;ii++){
            unseen = br.readLine();
            if (set.contains(unseen)){
                pq.add(unseen);
            }
        }
        bw.write(pq.size()+"\n");
        while (pq.size()>0) {
            bw.write(pq.poll() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
