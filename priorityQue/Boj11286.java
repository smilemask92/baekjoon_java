package priorityQue;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Boj11286 {
    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("priorityQue/input11286.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue pq = new PriorityQueue(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) > Math.abs(o2)) {
                    return 1; //절대값 기준으로 앞 값이 더 크다면: 양수! 자리를 바꾼다.
                }else if(Math.abs(o1) < Math.abs(o2)) {
                    return -1; //절대값 기준으로 뒤 값이 더 크다면: 음수! 자리를 바꾸지 않는다.
                }else {
                    return o1-o2; //절대값이 서로 같다면, 실제 수를 비교한다. 양수/음수로 결정나겠지.
                }
            }
        });

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        Integer n;
        int arr[];
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
