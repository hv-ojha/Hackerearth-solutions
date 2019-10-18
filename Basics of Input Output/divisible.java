import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         int[] A = new int[N];
         for(int i_A=0; i_A<arr_A.length; i_A++)
         {
         	A[i_A] = Integer.parseInt(arr_A[i_A]);
         }

         String out_ = solve(A);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static String solve(int[] A){
        String instart = new String();
        String inend = new String();
        int start = 0;
        int end = A.length - 1;
        int sum_even = 0;
        int sum_odd = 0;
        while(start < end) {
            instart = Integer.toString(A[start]);
            inend = Integer.toString(A[end]);
            int st_num = Character.getNumericValue(instart.charAt(0));
            int en_num = Character.getNumericValue(inend.charAt(inend.length()-1));
            if(start++ % 2 == 0)
                sum_even += st_num;
            else
                sum_odd += st_num;
            if (end-- % 2 == 0)
                sum_even += en_num;
            else
                sum_odd += en_num;
        }
        if(start == end) {
            int st_num = Character.getNumericValue(instart.charAt(0));
            sum_even += st_num;
        }
        return sum_even == sum_odd ? "OUI" : "NON";
    }
}