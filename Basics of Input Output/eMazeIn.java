import java.io.*;
import java.util.*;

public class eMazeIn {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        int hr = 0, vr = 0;
        for (int i = 0; i < str.length(); i++) {
            hr = str.charAt(i) == 'L' ? hr - 1 : str.charAt(i) == 'R' ? hr + 1 : hr;
            vr = str.charAt(i) == 'D' ? vr - 1 : str.charAt(i) == 'U' ? vr + 1 : vr;
        }
        System.out.println(hr + " " + vr);
    }    
}