import java.util.*;
import java.io.*;

/**
 * twoStrings
 */
public class twoStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            String[] s = br.readLine().trim().split("\\s+");
            HashMap<Character, Integer> str1 = new HashMap<>();
            HashMap<Character, Integer> str2 = new HashMap<>();
            for(int i = 0; i < (s[0].length() > s[1].length() ? s[0].length() : s[1].length()); i++) {
                if(i < s[0].length()){
                    if(str1.get(s[0].charAt(i)) == null)
                        str1.put(s[0].charAt(i), 1);
                    else
                        str1.put(s[0].charAt(i), str1.get(s[0].charAt(i)) + 1);
                }
                if (i < s[1].length()) {
                    if (str2.get(s[1].charAt(i)) == null)
                        str2.put(s[1].charAt(i), 1);
                    else
                        str2.put(s[1].charAt(i), str2.get(s[1].charAt(i)) + 1);
                }
            }
            if(str1.equals(str2))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}