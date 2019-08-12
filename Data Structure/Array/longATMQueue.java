import java.io.*;
import java.util.*;

/**
 * Long ATM Queue
 * 
 * Due to the demonetization move, there is a long queue of people in front of
 * ATMs. Due to withdrawal limit per person per day, people come in groups to
 * withdraw money. Groups come one by one and line up behind the already present
 * queue. The groups have a strange way of arranging themselves. In a particular
 * group, the group members arrange themselves in increasing order of their
 * height(not necessarily strictly increasing).
 * 
 * Swapy observes a long queue standing in front of the ATM near his house.
 * Being a curious kid, he wants to count the total number of groups present in
 * the queue waiting to withdraw money. Since groups are standing behind each
 * other, one cannot differentiate between different groups and the exact count
 * cannot be given. Can you tell him the minimum number of groups that can be
 * observed in the queue?
 */
public class longATMQueue {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        String[] input = br.readLine().trim().split(" ");
        int[] inputArray = new int[N];
        int count = 1;
        for (int i = 0; i < N; i++) {
            inputArray[i] = Integer.parseInt(input[i]);
            if (i > 0 && inputArray[i] < inputArray[i - 1])
                count++;
        }
        System.out.println(count);
    }
}