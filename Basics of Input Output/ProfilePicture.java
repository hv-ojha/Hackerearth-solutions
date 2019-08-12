import java.io.*;
import java.util.*;

/**
 * ProfilePicture
 */
public class ProfilePicture {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int N = Integer.parseInt(br.readLine().trim());
        int[][] arr = new int[N][2];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i][0] >= T && arr[i][1] >= T) {
                if ((arr[i][0] == T && arr[i][1] == T) || (arr[i][0] == arr[i][1] && arr[i][0] >= T))
                    System.out.println("ACCEPTED");
                else
                    System.out.println("CROP IT");
            }
            else
                System.out.println("UPLOAD ANOTHER");
        }
    }
}