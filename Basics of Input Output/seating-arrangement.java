/* PROBLEM STATEMENT :-
Akash and Vishal are quite fond of travelling. They mostly travel by railways.
They were travelling in a train one day and they got interested in the seating arrangement of their compartment. 
The compartment looked something like


So they got interested to know the seat number facing them and the seat type facing them. The seats are denoted as follows :

    Window Seat : WS
    Middle Seat : MS
    Aisle Seat : AS

You will be given a seat number, find out the seat number facing you and the seat type, i.e. WS, MS or AS.

INPUT
First line of input will consist of a single integer T denoting number of test-cases. Each test-case consists of a single integer N denoting the seat-number.

OUTPUT
For each test case, print the facing seat-number and the seat-type, separated by a single space in a new line.

CONSTRAINTS

    1<=T<=105
    1<=N<=108

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
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int rem = n % 12;
            int side = n % 6;
            int ans = 0;
            if (rem <= 6 && rem != 0) {
                switch (rem) {
                case 1:
                    ans = n + 11;
                    break;
                case 2:
                    ans = n + 9;
                    break;
                case 3:
                    ans = n + 7;
                    break;
                case 4:
                    ans = n + 5;
                    break;
                case 5:
                    ans = n + 3;
                    break;
                case 6:
                    ans = n + 1;
                    break;
                }
            } else {
                switch (rem) {
                case 0:
                    ans = n - 11;
                    break;
                case 11:
                    ans = n - 9;
                    break;
                case 10:
                    ans = n - 7;
                    break;
                case 9:
                    ans = n - 5;
                    break;
                case 8:
                    ans = n - 3;
                    break;
                case 7:
                    ans = n - 1;
                    break;
                }
            }
            System.out.print(ans);
            if (side == 0 || side == 1)
                System.out.print(" WS");
            else if (side == 2 || side == 5)
                System.out.print(" MS");
            else
                System.out.print(" AS");
            System.out.println();
        }
        sc.close();
    }
}
