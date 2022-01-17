// 시간 (45분 전)
package baekjoon;

import java.util.*;


public class q2884{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
        sc.close();
        String[] array = a.split(" ");
        int H = Integer.parseInt(array[0]);
        int M = Integer.parseInt(array[1]);

        M = M - 45;
        if(M < 0)
        {
            M =  60 + M;
            H--;
        }
        
        if(H < 0)
            H = 24 + H;

        System.out.println(H + " " + M);
    }
}