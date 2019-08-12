import java.io.*;
import java.util.*;

public class brickGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int i = 1, i2 = 2 * i;
        while(N > 0) {
            if (i >= N) {
                System.out.println("Patlu");
                break;
            }
            N -= i;
            if (i2 >= N) {
                System.out.println("Motu");
            }
            N -= i2;
            i2 = (++i) * 2;
        }
    }    
}