import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int starNum = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<starNum; j++) {
                sb.append("*");
            }
            starNum += 2;
            sb.append("\n");
        }

        System.out.println(sb);
    }
}