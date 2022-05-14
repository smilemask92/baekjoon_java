package setAndMap;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Boj1620 {
    public static boolean isDigit(String s){
        return Character.isDigit(s.charAt(0));
    }
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("setAndMap/input1620.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String numbers = br.readLine();
        int N = Integer.parseInt(numbers.split(" ")[0]);
        int M = Integer.parseInt(numbers.split(" ")[1]);
        Map<String,Integer> map1 = new HashMap();
        Map<Integer,String> map2 = new HashMap();
        String name;
        for (int ii = 1; ii<N+1; ii++){
            name = br.readLine().trim();
            map1.put(name,Integer.valueOf(ii));
            map2.put(Integer.valueOf(ii),name);
        }
        for (int ii = 1; ii<M+1; ii++){
            String s = br.readLine().trim();
            if (isDigit(s)){
                bw.write(map2.get(Integer.parseInt(s))+"\n");
            }else{
                bw.write(String.valueOf(map1.get(s))+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
