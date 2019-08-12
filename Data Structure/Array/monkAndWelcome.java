import java.io.*;
import java.util.*;

/**
 * Monk And Welcome Problem
 * Having a good previous year, Monk is back to teach algorithms
 * and data structures. This year he welcomes the learners with a problem which
 * he calls "Welcome Problem". The problem gives you two arrays A and B (each
 * array of size N) and asks to print new array C such that: ; Now, Monk will
 * proceed further when you solve this one. So, go on and solve it :)
 */
public class monkAndWelcome {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String[] firstArray = br.readLine().trim().split(" ");
        String[] secondArray = br.readLine().trim().split(" ");
        StringBuilder output = new StringBuilder();
        int op;
        for (int i = 0; i < N; i++) {
            op = Integer.parseInt(firstArray[i]) + Integer.parseInt(secondArray[i]);
            output.append(op + " ");
        }
        System.out.println(output.toString());
    }
}