// 나머지
package baekjoon;

import java.util.*;


public class q8958{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String[] a = sc.next().split("");
            int count = 0;
            int score = 0;
            for(int j = 0; j < a.length; j++)
            {
                 if(a[j].equals("O")){
                    count++;
                    score += count;
                 }
                 else  
                    count = 0;
            }
            System.out.println(score);
        }
        sc.close();        
    }
}