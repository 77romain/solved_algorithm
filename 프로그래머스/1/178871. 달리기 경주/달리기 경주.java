import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] players, String[] callings) { // players: 현재 등수, callings: 제친 선수 호명
        List<String> pList = new ArrayList<>(Arrays.asList(players));
        
        for(String calling:callings) {
            int playerIndex = pList.indexOf(calling); // 추월 성공한 선수 최초 위치
            int overPlayerIndex = playerIndex-1; // 추월당한 선수 최초 위치
            pList.set(playerIndex, pList.get(overPlayerIndex));  // 추월당한 선수 위치 뒤로 조정
            pList.set(playerIndex-1, calling); // 추월한 선수 위치 앞으로 조정
        }
        
        String[] answer = pList.toArray(new String[pList.size()]);
        
        return answer;
    }
}

// 풀이: 이중 for문을 쓰면 시간초과(최악의 경우: 500억ms)가 커서 ArrayList를 활용하여 선수 위치 교체 시간복잡도O(1)로 실시함.