import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String query = br.readLine();
        String[] queries = query.split(" ", 3);
        int a = Integer.parseInt(queries[0]);
        int b = Integer.parseInt(queries[1]);
        int c = Integer.parseInt(queries[2]);
        
        boolean chk = true;
        for(int i=a; i<=b; i++)
            if(i%c==0) chk = false;
        
        System.out.println(chk?"YES":"NO");
    }
}