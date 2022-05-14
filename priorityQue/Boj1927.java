package priorityQue;

import java.io.*;
import java.util.PriorityQueue;

public class Boj1927 {
    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("priorityQue/input1927.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue();
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        Integer n;
        while (s!=null){
            n = Integer.parseInt(s);
            if (n==0){
                if (pq.size()==0){
                    bw.write("0 \n");
                }else{
                    bw.write(pq.poll()+"\n");
                }
            }else {
                pq.add(n);
            }
            s = br.readLine();
        }
        bw.flush();
        bw.close();
    }
}
