import java.io.*;
import java.util.*;

/**
 * Hamiltonian And Lagrangian
 * 
 * Students have become secret admirers of SEGP. They find the course exciting
 * and the professors amusing. After a superb Mid Semester examination its now
 * time for the results. The TAs have released the marks of students in the form
 * of an array, where arr[i] represents the marks of the ith student.
 * 
 * Since you are a curious kid, you want to find all the marks that are not
 * smaller than those on its right side in the array.
 */
public class hamiltonianAndLagrangian {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] s = br.readLine().trim().split("\\s+");
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(s[i]);
        leaders(arr);
    }

    public static void leaders(int[] arrayData) {
        Stack<Integer> s = new Stack<>();
        StringBuffer str = new StringBuffer();
        int max = arrayData[arrayData.length - 1];
        s.push(max);
        for (int i = arrayData.length - 2; i >= 0; i--) {
            if (arrayData[i] >= max) {
                max = arrayData[i];
                s.push(max);
            }
        }
        while (s.isEmpty() == false)
            str.append(s.pop() + " ");
        System.out.println(str);
    }
}