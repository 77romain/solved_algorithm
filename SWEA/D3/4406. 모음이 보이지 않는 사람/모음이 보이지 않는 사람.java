import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    private static Scanner sc;
	public static void main(String args[]) throws Exception {
        sc = new Scanner(System.in);
		int T;
		T=Integer.parseInt(sc.nextLine());

		for(int test_case = 1; test_case <= T; test_case++) {
            disappearAeiou(test_case, sc);
		}
	}
    private static void disappearAeiou(int t, Scanner sc) {
        String[] str = sc.nextLine().trim().split("");
        String result = "";
        for(String s:str) {
            if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) continue;
            result += s;
        }
        System.out.printf("#%d %s\n", t, result);
    }
}