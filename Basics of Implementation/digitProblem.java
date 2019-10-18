import java.io.*;
import java.util.*;
/**
 * digitProblem
 */
public class digitProblem {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split(" ");
        int k = Integer.parseInt(input[1]);
        int M = input[0].length();
        char[] in = input[0].toCharArray();
        // StringBuffer output = new StringBuffer();
        int i = 0;
        int count = 0;
        while(count < k && i < M){
            System.out.print(count + " ");
            System.out.print(in);
            System.out.print("\n");
            if(in[i] != '9') {
                in[i] = '9';
                count++;
            }
            i++;
        }
        System.out.println(in);
    }
}