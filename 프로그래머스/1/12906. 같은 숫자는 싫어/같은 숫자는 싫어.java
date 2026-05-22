import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for(int arrBit:arr) {
            if(ad.size()==0)
                ad.addLast(arrBit);
            else
                if(ad.peekLast()!=arrBit)
                    ad.addLast(arrBit);
        }
        int[] answer = new int[ad.size()];
        int i=0;
        for(int answerBit:ad) {
            answer[i++] = answerBit;
        }
        
        

        return answer;
    }
}