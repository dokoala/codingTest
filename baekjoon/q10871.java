// X보다 작은 수
package baekjoon;

import java.util.*;


public class q10871{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
        String[] array = a.split(" ");
        int N = Integer.parseInt(array[0]);
        int X = Integer.parseInt(array[1]);
        String b = sc.nextLine();
        String[] array2 = b.split(" ");
        sc.close();

        String answer= "";

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(array2[i]) < X) {
                answer = answer + array2[i] + " ";
            }
        }
        
        System.out.println(answer);
    }
}