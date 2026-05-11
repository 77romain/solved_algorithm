import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=Integer.parseInt(sc.nextLine().trim());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int cnt = 0;
            int n = Integer.parseInt(sc.nextLine().trim());
            String answer = sc.nextLine();
            String writing = sc.nextLine();
            String[] answerBits =answer.split("", n);
            String[] writingBits = writing.split("", n);
            for(int i=0; i<n ;i++)
                if(answerBits[i].equals(writingBits[i]))
                    cnt++;
            
            System.out.printf("#%d %d\n", test_case, cnt);
		}
	}
}