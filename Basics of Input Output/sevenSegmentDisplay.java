import java.io.*;
import java.util.*;

/**
 * sevenSegmentDisplay
 */
public class sevenSegmentDisplay {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int[] value = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        while(T-- > 0) {
            String[] input = br.readLine().trim().split("");
            int total_matchstick = 0;
            for(String s : input) 
                total_matchstick += value[Integer.parseInt(s)];
            if(total_matchstick % 2 == 0) {
                for(int i = 0; i < total_matchstick/2; i++) 
                    System.out.print("1");
                System.out.println();
            }
            else {
                System.out.print("7");
                total_matchstick -= 3;
                for (int i = 0; i < total_matchstick / 2; i++)
                    System.out.print("1");
                System.out.println();
            }
        }
    }
}