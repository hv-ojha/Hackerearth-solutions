import java.io.*;
import java.util.*;
import java.lang.*;

class neutralisation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringBuilder input = new StringBuilder(br.readLine().trim());
        Stack<Character> outputStack = new Stack<>();
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            if(outputStack.isEmpty()) {
                outputStack.push(input.charAt(i));
            }
            else if(outputStack.peek() == input.charAt(i))
                outputStack.pop();
            else
                outputStack.push(input.charAt(i));
        }
        System.out.println(outputStack.size());
        while(outputStack.isEmpty() == false) {
            output.append(outputStack.pop());
        }
        System.out.println(output.reverse());
    }
}