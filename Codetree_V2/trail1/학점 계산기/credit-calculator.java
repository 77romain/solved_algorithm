import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double sum = 0;
        for(int i=0; i<n; i++) 
            sum += sc.nextDouble();

        double avg = sum/n;
        
        String result = "";
        if(avg>=4.0)
            result = "Perfect";
        else if(avg>=3.0)
            result = "Good";
        else
            result = "Poor";

        System.out.printf("%.1f\n%s", avg, result);
    }
}