package baekjoon.math1;

import java.util.*;


public class q1712{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String value = sc.next();
        String[] value2 = value.split("\\s");
        
        int result;
        int A = Integer.parseInt(value2[0]);
        int B = Integer.parseInt(value2[1]);
        System.out.println(value2[1]);
        int C = Integer.parseInt(value2[2]);
        int count = 1;

        if(B < C){
            while(A+(B*count)<=C*count)
            {
                count++;
            }
            result = count;
        }
        else   
            result = -1;
        

        System.out.println(result);
    }
}