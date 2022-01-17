package baekjoon.math1;

import java.util.*;


public class q2775{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();
        int count = 1;
        while(count <= testcase)
        {
          int a = sc.nextInt();
          int b = sc.nextInt();
          System.out.println(Function(a, b));           
          count++;
        }
    }
    public static int Function(int a,int b)
    {
        if(a == 0)
        {
          return b;
        }
        else if(b == 1)
        {
          return 1;
        }
        else if(b == 0)
        {
          return 0;
        }
        else
        {
            return Function(a-1,b) + Function(a, b-1);
        }
    }
}