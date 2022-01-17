package baekjoon.math1;

import java.util.*;


public class q2839{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int a = sc.nextInt();
        System.out.println(Function(a));
    }
    public static int Function(int a)
    {
        if(a - 3 <= 0 && a - 5 <=0)
        {
          return -1;
        }
        else if(a - 3 == 0 && a - 5 == 0)
        {
          return 1;
        }
        else
        {
            return Function(a-3) + Function(a-5) + 4;
        }
    }
}