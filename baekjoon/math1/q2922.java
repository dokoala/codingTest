package baekjoon.math1;

import java.util.*;


public class q2922{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int B = 1;
        int add = 6;
        int count = 1;
        
        while(value > B){
          B += add * count;
          count++;                    
        }

        System.out.println(count);
    }
}