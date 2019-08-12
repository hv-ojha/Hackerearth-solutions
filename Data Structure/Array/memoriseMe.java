import java.io.*;
import java.util.*;

/**
 * Memorise Me
 * 
 * Arijit is a brilliant boy. He likes memory games. He likes to participate
 * alone but this time he has to have a partner. So he chooses you.
 * 
 * In this Game , your team will be shown N numbers for few minutes . You will
 * have to memorize these numbers.
 * 
 * Now, the questioner will ask you Q queries, in each query He will give you a
 * number , and you have to tell him the total number of occurrences of that
 * number in the array of numbers shown to your team . If the number is not
 * present , then you will have to say “NOT PRESENT” (without quotes).
 */
public class memoriseMe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String[] s = br.readLine().trim().split("\\s+");
        int[] arrayData = new int[N];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < N; i++) {
            arrayData[i] = Integer.parseInt(s[i]);
            if(hm.get(arrayData[i]) == null)
                hm.put(arrayData[i], 1);
            else
                hm.put(arrayData[i], (hm.get(arrayData[i]) + 1));
        }
        int X = Integer.parseInt(br.readLine().trim());
        for(int i = 0; i < X; i++) {
            int search = Integer.parseInt(br.readLine().trim());
            System.out.println(hm.get(search) == null ? "NOT PRESENT" : hm.get(search));
        }
    }
}