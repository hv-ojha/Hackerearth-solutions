import java.io.*;
import java.util.*;

class vowelRecongnition {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            char[] inputArray = br.readLine().trim().toCharArray();
            int N = inputArray.length;
            long ans = 0;
            long total = 0;
            for(int i = 0; i < N; i++) {
                ans = (ans - i) + (N - i);
                if(inputArray[i] == 'a' || inputArray[i] == 'e' || inputArray[i] == 'i' || inputArray[i] == 'o' || inputArray[i] == 'u' || inputArray[i] == 'A' || inputArray[i] == 'E' || inputArray[i] == 'I' || inputArray[i] == 'O' || inputArray[i] == 'U') {
                    total += ans;
                }
            }
            System.out.println(total);
        }
    }
}