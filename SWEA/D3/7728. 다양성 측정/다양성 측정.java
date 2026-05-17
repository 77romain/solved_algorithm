import java.util.Scanner;
import java.util.HashSet;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
            String[] nBits = sc.next().split("");
            HashSet<String> hashset = new HashSet<>();
            for(String nBit : nBits) {
                hashset.add(nBit);
            }
            System.out.printf("#%d %d\n", test_case, hashset.size());
		}
	}
}