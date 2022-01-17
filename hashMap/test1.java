package hashMap;

import java.util.*;

public class test1{

    public static void main(String[] args) {
        
        test1 t1 = new test1();

        String[] participant1 = {"leo", "kiki", "eden"};
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};

        String[] completion1 = {"eden", "kiki"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        
        System.out.println(t1.solution2(participant1, completion1));
        System.out.println(t1.solution2(participant2, completion2));
        System.out.println(t1.solution2(participant3, completion3));
    }
    
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        int num = 0;
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length; i++) {            
            if(i == completion.length-1 && completion[i] == participant[i])
            {
                answer = participant[i+1];
                break;
            }
            if(participant[i] != completion[i]){
                answer = participant[i];
                break;
            }        
        }
        
        return answer;
    }

    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(String fail : participant)
            hm.put(fail, hm.getOrDefault(fail, 0) + 1);
        for(String fail : completion)
            hm.put(fail, hm.get(fail)-1);

        for(String key : hm.keySet()){
            if(hm.get(key) != 0)
            {
                answer = key;
            }
        }
        
        return answer;
    }
}