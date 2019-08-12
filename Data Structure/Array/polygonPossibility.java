import java .io.*;
import java.util.*;

/**
 * Polygon Possibility
 * 
 * You are given length of n sides, you need to answer whether it is possible to
 * make n sided convex polygon with it.
 */
public class polygonPossibility {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] inputString = br.readLine().trim().split(" ");
            int[] input = new int[N];
            int max = 0;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                input[i] = Integer.parseInt(inputString[i]);
                sum += input[i];
                max = input[i] > max ? input[i] : max;
            }
            sum -= max;
            System.out.println(sum > max ? "Yes\n" : "No\n");
        }
    }
}