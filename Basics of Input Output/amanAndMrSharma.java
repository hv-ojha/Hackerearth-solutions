import java.io.*;
import java.util.*;
/**
 * amanAndMrSharma
 */
public class amanAndMrSharma {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int toffee = 0;
        while(T-- > 0) {
            String[] str = br.readLine().trim().split("\\s+");
            int radius = Integer.parseInt(String.valueOf(str[0]));
            int horlicks = Integer.parseInt(String.valueOf(str[1]));
            int circumference = (22 * (2 * radius)) / 7;
            int runn = horlicks * 100;
            if(runn > circumference) 
                toffee++;
        }
        System.out.println(toffee);
    }
}