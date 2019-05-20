/*
 * PROBLEM STATEMENT
 * 
 * You have been given a String S. You need to find and print whether this
 * string is a palindrome or not. If yes, print "YES" (without quotes), else
 * print "NO" (without quotes).
 * 
 * Input Format The first and only line of input contains the String S. The
 * String shall consist of lowercase English alphabets only.
 * 
 * Output Format Print the required answer on a single line.
 * 
 * Constraints
 * 
 * Note String S consists of lowercase English Alphabets only.
 * 
 */



/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[]) throws Exception {
        /*
         * Sample code to perform I/O: Use either of these methods for input
         * 
         * //BufferedReader BufferedReader br = new BufferedReader(new
         * InputStreamReader(System.in)); String name = br.readLine(); // Reading input
         * from STDIN System.out.println("Hi, " + name + "."); // Writing output to
         * STDOUT
         * 
         * //Scanner Scanner s = new Scanner(System.in); String name = s.nextLine(); //
         * Reading input from STDIN System.out.println("Hi, " + name + "."); // Writing
         * output to STDOUT
         * 
         */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char[] strev = st.toCharArray();
        int len = strev.length;
        for (int i = 0; i < (len / 2); i++) {
            char temp = strev[i];
            strev[i] = strev[len - i - 1];
            strev[len - i - 1] = temp;
        }
        String rev = new String(strev);
        if (rev.equals(st))
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
