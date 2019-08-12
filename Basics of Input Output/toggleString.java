import java.io.*;
import java.util.*;

/**
 * toggleString
 */
public class toggleString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer str = new StringBuffer(br.readLine().trim());
        for(int i = 0; i < str.length(); i++)
            str.setCharAt(i, (Character.isUpperCase(str.charAt(i)) ? Character.toLowerCase(str.charAt(i)) : Character.toUpperCase(str.charAt(i)) ));
        System.out.println(str);
    }
}