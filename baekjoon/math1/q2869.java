package baekjoon.math1;

import java.util.*;


public class q2869{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] value =  a.split("-");
        int A = Integer.parseInt(value[0]);
        int B = Integer.parseInt(value[1]);
        int C = Integer.parseInt(value[2]);
        int day = 1;
        int value2 = A;

        while(value2 < C){
          value2 = value2 + A - B;
          day++;
        }

        System.out.println(day);
    }
}