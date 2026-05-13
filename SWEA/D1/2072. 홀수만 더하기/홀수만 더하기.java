
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int[] numbers = new int[10];
            for(int i=0; i<10; i++) numbers[i] = sc.nextInt();
            System.out.printf("#%d %d\n", test_case, oddSum(numbers));

		}
	}
    
    private static int oddSum(int[] numbers) {
        int sum = 0;
        for(int n:numbers) {
            sum += n%2!=0?n:0;
        }
        return sum;
    }
}