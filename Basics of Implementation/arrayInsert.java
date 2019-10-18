import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().trim().split(" ");
        int N = Integer.parseInt(numbers[0]);
        int Q = Integer.parseInt(numbers[1]);
        String[] arr = br.readLine().trim().split(" ");
        int[] inputArray = new int[N];
        for(int i = 0; i < N; i++)
            inputArray[i] = Integer.parseInt(arr[i]);
        while(Q-- > 0) {
            String[] query = br.readLine().trim().split(" ");
            int qtype = Integer.parseInt(query[0]);
            int i = Integer.parseInt(query[1]);
            int j = Integer.parseInt(query[2]);
            if(qtype == 1) {
                inputArray[i] = j;
            }
            else {
                int sum = 0;
                for(int it = i; it <= j; it++) {
                    sum += inputArray[it];
                }
                System.out.println(sum);
            }
        }
    }
}