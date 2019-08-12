import java.io.*;
import java.util.*;

public class liftQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int A = 0;
        int B = 7;
        while(T-- > 0) {
            int query = Integer.parseInt(br.readLine().trim());
            if(Math.abs(query - A) <= Math.abs(query - B) && A < B) {
                A = query;
                System.out.println("A");
            }
            else {
                B = query;
                System.out.println("B");
            }
        }
    }    
}