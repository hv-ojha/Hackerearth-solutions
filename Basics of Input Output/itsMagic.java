import java.io.*;
/**
 * Sussutu is a world-renowned magician.
 * And recently, he was blessed with the power to remove EXACTLY ONE element from an array.
 * Given, an array A (index starting from 0) with N elements.
 * Now, Sussutu CAN remove only that element which makes the sum of ALL the remaining elements exactly divisible by 7.
 * Throughout his life, Sussutu was so busy with magic that he could never get along with maths.
 * Your task is to help Sussutu find the first array index of the smallest element he CAN remove.
 * 
 * 
 * Input:
 * The first line contains a single integer N.
 * Next line contains N space separated integers Ak , 0 < k < N.
 * 
 * Output:
 * Print a single line containing one integer, the first array index of the smallest element he CAN remove, and -1 if there is no such element that he can remove!
 * 
 * Constraints:
 * 1 < N < 105
 * 0 < Ak < 109
 */

public class itsMagic {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine().trim());
        String[] stringInput = br.readLine().trim().split(" ");
        long[] arrayInput = new long[N];
        long sum = (long) 0;
        int ans = -1;
        for(int i = 0; i < N; i++) {
            arrayInput[i] = Integer.parseInt(stringInput[i]);
            sum += arrayInput[i];
        }
        for(int i = 0; i < N; i++) {
            long temp = sum - arrayInput[i];
            if(temp%7 == 0) {
                if(ans == -1 || arrayInput[i] < arrayInput[ans])
                    ans = i;
            }
        }
        System.out.println(ans);
    }
}