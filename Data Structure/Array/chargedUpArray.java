import java.io.*;
import java.util.*;

/**
 * Charged Up Array
 * 
 * You are given with an array of size .An element is said to be charged if its
 * value() is greater than or equal to . is the total number of subsets of array
 * , that consist of element . Total charge value of the array is defined as
 * summation of all charged elements present in the array mod . Your task is to
 * output the total charge value of the given array .
 */
public class chargedUpArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            long[] A = new long[N];
            for (int i_A = 0; i_A < arr_A.length; i_A++) {
                A[i_A] = Long.parseLong(arr_A[i_A]);
            }
            int out_ = solve(A, N);
            System.out.println(out_);
            System.out.println("");
        }
        wr.close();
        br.close();
    }
    static int solve(long[] A, int N) {
        // Write your code here
        double k = Math.pow(2, N - 1);
        long s = 0;
        long mod = 1000000007;
        for (int i = 0; i < N; i++) {
            s += A[i] >= k ? A[i] : 0;
        }
        long ans = s % mod;
        return (int) ans;
    }
}