// 나머지
package baekjoon;

import java.util.*;


public class q1546{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] =  new int[N];
        int max = 1;
        int sum = 0;
        double avg = 0.0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("최대값  : " + max);
        sc.close();

        avg = 100.0 * sum / max / N;
        System.out.println(avg);
    }
}