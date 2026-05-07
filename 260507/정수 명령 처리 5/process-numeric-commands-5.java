import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String tmp = sc.nextLine(); // 개행문자 담는 용도
        List<Integer> alist = new ArrayList<>();

        for(int i=0; i<n; i++) {
            String cmdBits = sc.nextLine();
            String[] cmdBit = cmdBits.split(" ");
            String cmd = cmdBit[0];
            switch(cmd) {
                case "push_back": 
                    alist.add(Integer.parseInt(cmdBit[1]));
                    break;
                case "pop_back": 
                    int lastIndex = alist.size()-1;
                    alist.remove(lastIndex); 
                    break;
                case "size": 
                    System.out.println(alist.size()); 
                    break;
                case "get": 
                    System.out.println(alist.get(Integer.parseInt(cmdBit[1])-1)); 
                    break;
            }
        }
    }
}