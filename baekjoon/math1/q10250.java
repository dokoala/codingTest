package baekjoon.math1;

import java.util.*;


public class q10250{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        int count = 1;
        while(count <= testcase)
        {
          String a = sc.next();
          String[] value =  a.split("-");
          int A = Integer.parseInt(value[0]);
          int B = Integer.parseInt(value[1]);
          int C = Integer.parseInt(value[2]);
          
          int H = C%A;
          int W = C/A+1;

          if(W/10==0)
            System.out.println(H+"0"+W);
          else
            System.out.println(H+W);
          count++;
        }
    }
}