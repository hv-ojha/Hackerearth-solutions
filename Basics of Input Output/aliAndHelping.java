import java.io.*;
import java.util.*;

/**
 * aliAndHelping
 */
public class aliAndHelping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        boolean flag = true;
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i + 1) < 48 || str.charAt(i + 1) > 57) {
                if(isVowel(str.charAt(++i))) {
                    flag = false;
                    break;
                }
                else
                    continue;
            }
            if(((Integer.parseInt(String.valueOf(str.charAt(i)))) + (Integer.parseInt(String.valueOf(str.charAt(i + 1))))) % 2 != 0) {
                flag = false;
                break;
            }
        }
        if(flag == true)
            System.out.println("valid");
        else
            System.out.println("invalid");
    }
    static boolean isVowel(char ch) {
        return ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y') && !(ch == '-'));
    }
}