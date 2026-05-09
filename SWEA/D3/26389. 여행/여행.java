import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        String tmp = sc.nextLine();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            boolean chk = false;
            String query = sc.nextLine();
            if((query.contains("S") && !query.contains("N")) || (!query.contains("S") && query.contains("N")) || (query.contains("E") && !query.contains("W")) || (!query.contains("E") && query.contains("W")))
                chk = false;
            else
                chk = true;
            System.out.println(chk?"Yes":"No");    
		}
	}
}