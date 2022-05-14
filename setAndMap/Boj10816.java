package setAndMap;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj10816 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("setAndMap/input10816.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        Map<String,Integer> map = new HashMap();
        String k1;
        for (int ii=0; ii<N; ii++){
            k1 = st1.nextToken();
            if (map.containsKey(k1)){
                map.put(k1,map.get(k1)+1);
            }else{
                map.put(k1,Integer.valueOf(1));
            }
        }
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        String k2;
        for (int ii=0;ii<M;ii++){
            k2 = st2.nextToken();
            if (map.containsKey(k2)){
                bw.write(Integer.valueOf(map.get(k2))+" ");
            }else{
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();
    }
}
