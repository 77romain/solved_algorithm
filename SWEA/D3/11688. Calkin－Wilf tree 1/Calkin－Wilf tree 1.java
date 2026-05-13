import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
            String query = sc.next();
			calculate(test_case, query);
		}
	}
    
    private static void calculate(int test_case, String query) {
        int[] node = {1, 1}; // O: a/b,   L: a/a+b,  R : a+b/b
        String[] queryBits = query.split("");
        for(String s:queryBits)
            node = s.equals("L")?doLeft(node):doRight(node);
       
        System.out.printf("#%d %d %d\n", test_case, node[0], node[1]);
    }
    
    private static int[] doLeft(int[] node) {
        node[1] = node[0]+node[1];
        return node;
    }
    private static int[] doRight(int[] node) {
        node[0] = node[0]+node[1];
        return node;
    }
}