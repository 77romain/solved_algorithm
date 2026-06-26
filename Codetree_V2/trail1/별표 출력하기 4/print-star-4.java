import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStar(n);
    }

    private static void printStar(int n) {
        int cur = n;
        boolean status = false;
        for(int i=0; i<n*2-1; i++) {
            for(int j=0; j<cur; j++)
                System.out.print("* ");
            System.out.println("");

            if(!status&&cur==1) status=true;
            cur = status ? cur+1 : cur-1;
        }
    }
}