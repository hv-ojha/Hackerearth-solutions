import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class anagrams {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            String str1 = br.readLine().trim();
            String str2 = br.readLine().trim();
            int[] count1 = new int[26];
            int[] count2 = new int[26];
            for(int i = 0; i < (str1.length() > str2.length() ? str1.length() : str2.length()); i++) {
                if(i < str1.length())
                    count1[str1.charAt(i) - 'a']++;
                if(i < str2.length())
                    count2[str2.charAt(i) - 'a']++;
            }
            int res = 0;
            for(int i = 0; i < 26; i++)
                res += Math.abs(count1[i] - count2[i]);
            System.out.println(res);
        }
    }
}