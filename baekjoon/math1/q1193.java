package baekjoon.math1;

import java.util.*;


public class q1193{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();

        int n = 1;
        int a = n;
        int A,B;
        while(a < value)
        {
          n++;
          a += n;
        }
        value = value - a + n;

        if(n%2==0)
        {
          A = value;
          B = n - value + 1;
        }
        else{
          B = value;
          A = n - value + 1;
        }

        String result = A + "/" + B;

        System.out.println(result);
    }
}