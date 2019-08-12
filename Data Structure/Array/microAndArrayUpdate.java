import java.io.*;
import java.util.*;

/**
 * Micro And Array Update
 * 
 * Micro purchased an array A having N integer values. After playing it for a
 * while, he got bored of it and decided to update value of its element. In one
 * second he can increase value of each array element by 1. He wants each array
 * element's value to become greater than or equal to K. Please help Micro to
 * find out the minimum amount of time it will take, for him to do so.
 */
public class microAndArrayUpdate {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine().trim());while(T-->0)
    {
        String line1 = br.readLine().trim();
        int N = Integer.parseInt(line1.split(" ")[0]);
        long k = Integer.parseInt(line1.split(" ")[1]);
        String[] inputArray = br.readLine().trim().split(" ");
        long[] arr = new long[N];
        for (int i = 0; i < N; i++)
            arr[i] = Long.parseLong(inputArray[i]);
        Arrays.sort(arr);
        long count = 0;
        while (true) {
            if (arr[0] < k) {
                count++;
                arr[0]++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}