import java.io.*;
import java.util.*;
/**
 * playWithNumbers
 */
public class playWithNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arrayInt = br.readLine().trim().split("\\s+");
        String[] array = br.readLine().trim().split("\\s+");
        int[] ArrayData = new int[array.length];
        for(int i = 0; i < array.length; i++)
            ArrayData[i] = Integer.parseInt(array[i]);
        int queries = Integer.parseInt(arrayInt[1]);
        while(queries-- > 0) {
            String[] inpuStrings = br.readLine().trim().split("\\s+");
            int l = Integer.parseInt(inpuStrings[0]) - 1;
            int r = Integer.parseInt(inpuStrings[1]) - 1;
            int sum = 0;
            while(l < r) {
                sum += ArrayData[l++] + ArrayData[r--];
            }
            sum = l == r ? ArrayData[l]+sum : sum;
            // int len = (sum/(r - l));
            System.out.println(l + " " + r);
        }
    }
}