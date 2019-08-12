import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

/**
 * Binary Queries 
 * Some problems appear hard though they are very easy. Today
 * Aakash is stuck in a range query problem. He has been given an array with
 * only numbers 0 and 1. There are two types of queries -
 * 
 * 0 L R : Check whether the number formed from the array elements L to R is
 * even or odd and print EVEN or ODD respectively. Number formation is the
 * binary number from the bits status in the array L to R
 * 
 * 1 X : Flip the Xth bit in the array
 * 
 * Indexing is 1 based
 */

class binaryQueries {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine().trim();
        int N = Integer.parseInt(line1.split(" ")[0]);
        int queries = Integer.parseInt(line1.split(" ")[1]);
        StringBuilder output = new StringBuilder();
        String[] input = br.readLine().trim().split(" ");
        while(queries-- > 0) {
            String[] line2 = br.readLine().trim().split(" ");
            if(line2[0].equals("0")) {
                int l = Integer.parseInt(line2[1]);
                int r = Integer.parseInt(line2[2]) - 1;
                output.append(input[r].equals("0") ? "EVEN" + "\n" : "ODD" + "\n");
            }
            if(line2[0].equals("1")) {
                int offset = Integer.parseInt(line2[1]) - 1;
                input[offset] = input[offset].equals("0") ? "1" : "0";
            }
        }
        System.out.print(output.toString());
    }
}
