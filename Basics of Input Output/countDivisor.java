import java.io.*;
import java.util.*;

/**
 * countDivisor
 */
public class countDivisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] Numbers = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int start = Numbers[0];
        int end = Numbers[1];
        int count = 0;
        while(start < end) {
            count = start++ % Numbers[2] == 0 ? count + 1 : count;
            count = end-- % Numbers[2] == 0 ? count + 1 : count;
        }
        count = start == end ? start % Numbers[2] == 0 ? count + 1 : count : count;
        System.out.println(count);
    }
}