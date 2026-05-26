class Solution {
    public int solution(String s) {
        String answer = "";
        String[] strBits = s.split("");
        
        String tmpStr = "";
        for(String strBit : strBits) {
            if(strBit.equals("0")||strBit.equals("1")
               ||strBit.equals("2")||strBit.equals("3")
               ||strBit.equals("4")||strBit.equals("5")
               ||strBit.equals("6")||strBit.equals("7")
               ||strBit.equals("8")||strBit.equals("9")) { // 0~9 숫자가 나올시, 결과 문자열에 추가
                answer += strBit;
            }else { // 알파벳이 나올시, 임시문자열(tmpStr) 검사하여 숫자로 변환가능하면, 변환하여 결과 문자열에 추가하고, 임시문자열은 빈문자열로 초기화.
                tmpStr += strBit;
                if(!changeNum(tmpStr).equals("?")) {
                    answer += changeNum(tmpStr);
                    tmpStr = "";
                }
            }
        }
        return Integer.parseInt(answer);
    }
    
    private String changeNum(String tmpStr) {
        switch(tmpStr) {
            case "zero": return "0";
            case "one": return "1";
            case "two": return "2";
            case "three": return "3";
            case "four": return "4";
            case "five": return "5";
            case "six": return "6";
            case "seven": return "7";
            case "eight": return "8";
            case "nine": return "9";
            default: return "?"; // 숫자로 변환 불가시 "?" 반환
        }
    }
}