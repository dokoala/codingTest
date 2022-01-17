package hashMap;

import java.util.*;

public class test3 {
    public static void main(String[] args) {
        int a = 2;
        String[][] clothes = {{"yellowhat","headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList kinds;
        for(int i = 0; i <  clothes.length-1; i++){
            if(hm.containsKey(clothes[i][1]))
                hm.put(clothes[i][1], hm.get(clothes[i][1]+1));
            else
                hm.put(clothes[i][1], 0);
        }
        System.out.println(hm.size());
        System.out.println(hm.values());
        return 1;
    }
}















// class Solution {
//     public int solution(String[][] clothes) {
//           int answer = 1;
//           HashMap<String, Integer> clo = new HashMap<>();
//           String[] category = new String[clothes.length];
          
//           for(int i = 0; i < clothes.length; i++)
//           {	 
//               category[i] = clothes[i][1];
//               if(clo.containsKey(clothes[i][1]))
//                  {
//                   clo.put(clothes[i][1], clo.get(clothes[i][1])+1);
//                 }
//               else
//                   clo.put(clothes[i][1], 1);
//           }
          
//           for(int value : clo.values())
//               answer *= (value+1);
          
//           System.out.println(clo);
          
//           return answer-1;
          
//       }
//   }
