import java.io.*;
import java.util.*;
/**
 * bookOfPotionMaking
 */
public class bookOfPotionMaking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer str = new StringBuffer(br.readLine().trim());
        if(str.length() != 10)
            System.out.println("Illegal ISBN");
        else {
            int result = 0;
            for (int i = 0; i < str.length(); i++) {
                result += ((Integer.parseInt(String.valueOf(str.charAt(i)))) * (i + 1));
            }
            System.out.println(result % 11 == 0 ? "Legal ISBN" : "Illegal ISBN");
        }
    }
}