// 평균은 넘겠지
package baekjoon;

import java.io.*;
import java.util.*;



public class bufferTest{

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //선언
        
        int tc = bf.read();

        
        
        bw.flush();
        bw.close();
        bf.close();
    }
}