// 숫자의 개수
package baekjoon;

import java.util.*;


public class q2577{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int value = a * b * c;
        String[] value1 = Integer.toString(value).split("");
        int[] arr;
        arr = new int[10];
        for (int i = 0; i < value1.length; i++) {
            arr[Integer.parseInt(value1[i])]++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}