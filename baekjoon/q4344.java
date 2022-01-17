// 평균은 넘겠지
package baekjoon;

import java.io.*;
import java.util.*;



public class q4344{

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //선언
        
        int tc = bf.read();
        
        for (int i = 0; i < tc; i++) {
            String[] show = bf.readLine().split("\\s");
            int count = 0;
            int sum = 0;
            int average = 0;
            float percent = 0;
            for (int j = 1; j < show.length; j++) {
                sum += Integer.parseInt(show[j]);
            }
            average = sum/Integer.parseInt(show[0]);
            for (String value : show) {
                if(average < Integer.parseInt(value))
                {
                    count++;
                }
            }
            percent = count/Integer.parseInt(show[0]);
            bw.write(Float.toString(percent));
        }
        
        bw.flush();
        bw.close();
        bf.close();
    }
}