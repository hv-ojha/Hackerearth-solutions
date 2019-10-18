import java.io.*;
import java.util.*;

class additionNotSimple {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] alpha = new String("abcdefghijklmnopqrstuvwxyz").toCharArray();
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            String input = br.readLine().trim();
            char[] charinput = input.toCharArray();
            char[] output = new char[charinput.length];
            int i = 0;
            int j = charinput.length - 1;
            int ans;
            while(i <= j) {
                ans = (charinput[i] - 97) + (charinput[j] - 97);
                if(ans > 25)
                    ans = ans - 26;
                output[i++] = output[j--] = alpha[ans + 1];
            }
            System.out.println(output);
        }
    }
}