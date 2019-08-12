import java.io.*;
import java.util.*;
/**
 * duration
 */
public class duration {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int T = Integer.parseInt(br.readLine().trim());
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int SH = sc.nextInt();
            int SM = sc.nextInt();
            int EH = sc.nextInt();
            int EM = sc.nextInt();
            int RH = EH - SH;
            int RM = 0;
            if(EM >= SM) {
                RM = EM - SM;
            }
            else {
                RM = (60 - SM) + EM;
                RH--;
            }
            System.out.println(RH + " " + RM);
        }
        sc.close();
    }
}