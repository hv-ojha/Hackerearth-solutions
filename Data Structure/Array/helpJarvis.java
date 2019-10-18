import java.io.*;
import java.util.*;

class helpJarvis {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String[] input = new String[N];
        StringBuffer output = new StringBuffer();
        for(int i = 0; i < N; i++) {
            input[i] = br.readLine().trim();
        }
        for(int i = 0; i < N; i++) {
            String ch = Integer.toString(input[i].length() + 1);
            if(input[i].contains(ch)) {
                output.append("NO\n");
            }
            else {
                output.append("YES\n");
            }
        }
        System.out.println(output);
    }
}