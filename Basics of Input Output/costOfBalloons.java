import java.io.*;
import java.util.*;

/**
 * costOfBalloons
 */
public class costOfBalloons {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            String[] colors = br.readLine().trim().split("\\s+");
            int green = Integer.parseInt(colors[0]);
            int purple = Integer.parseInt(colors[1]);
            int N = Integer.parseInt(br.readLine().trim());
            int sum1 = 0, sum2 = 0;
            for(int i = 0; i < N; i++) {
                String[] input = br.readLine().trim().split("\\s+");
                sum1 += Integer.parseInt(input[0]);
                sum2 += Integer.parseInt(input[1]);
            }
            int mul = (sum1 >= sum2 ? sum1 : sum2) * (green <= purple ? green : purple);
            mul += (sum1 < sum2 ? sum1 : sum2) * (green > purple ? green : purple);
            System.out.println(mul);
        }
    }
}