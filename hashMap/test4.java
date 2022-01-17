package hashMap;

import java.util.*;

public class test4 {
    public static void main(String[] args) {
        int a = 2;
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        
        System.out.println(solution(genres, plays));
    }
        
    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String, String[][]> MList = new HashMap<>(); // 해쉬맵
        int[][] song = new int[plays.length][2];
        for (int i = 0; i < plays.length; i++) {
            song[i][0] = i;
            song[i][1] = plays[i];
        }

        Arrays.sort(song, Comparator.comparingInt(o1 -> o1[1]));
        
        for (int i = song.length-1 ; i >= 0; i--) {
            
        }
        return answer;
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
