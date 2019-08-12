import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class factorial {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int start = 1, product = 1, end = N;
        while (start < end) {
            product *= start++;
            product *= end--;
        }
        product = start == end ? product * start : product;
        System.out.println(product);
    }
}