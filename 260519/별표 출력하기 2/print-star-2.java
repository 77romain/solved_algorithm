import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int oneLineStar = n;
        for(int i=0; i<n; i++) {
            for(int j=0; j<oneLineStar; j++) {
                System.out.print("* ");
            }
            oneLineStar--;
            System.out.println("");
        }
    }
}