// 나머지
package baekjoon;

import java.util.*;


public class q3052{

    public static void main(String[] args) {

        int[] arr;
        arr = new int[42];
        
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while(a != 10){
            arr[sc.nextInt()%42] ++;
            a++;
        }
        sc.close();        

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                count++;
            }
        }

        System.out.println(count);
    }
}