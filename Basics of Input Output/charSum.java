import java.io.*;
import java.util.*;
/**
 * charSum
 */
public class charSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer str = new StringBuffer(br.readLine().trim());
        int weight = 0;
        for (int i = 0; i < str.length(); i++) {
            weight += (((int) str.charAt(i)) + 1) - 97;
        }
        System.out.println(weight);
    }
}