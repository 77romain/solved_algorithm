import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                for(int k=i; k<n; k++)
                    sb.append("*");
                sb.append(" ");
            }
            if(i!=n-1)
                sb.append("\n");
        }

        System.out.println(sb);
    }
}