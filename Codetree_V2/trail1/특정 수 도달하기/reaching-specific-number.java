import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strBits = sc.nextLine().split(" ");
        double sum = 0;
        double cnt = 0;
        for(String strBit:strBits) {
            int n = Integer.parseInt(strBit);
            if(n >= 250) break;
            sum += n;
            cnt++;
        }

        double avg = sum/cnt;
        System.out.printf("%.0f %.1f", sum, avg);
    }
}