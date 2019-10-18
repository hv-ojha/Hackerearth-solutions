import java.io.*;
import java.util.*;

class cipher {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputArray = br.readLine().trim().toCharArray();
        int K = Integer.parseInt(br.readLine().trim());
        for(int i = 0; i < inputArray.length; i++) {
            if(Character.isDigit(inputArray[i]) || Character.isLetter(inputArray[i])) {
                if (Character.isDigit(inputArray[i])) {
                    inputArray[i] += K % 10;
                    if (!Character.isDigit(inputArray[i])) {
                        int diff = (int)(inputArray[i] - '9');
                        inputArray[i] = (char)('0' + diff - 1);
                    }
                } else if (Character.isUpperCase(inputArray[i])) {
                    inputArray[i] += K % 26;
                    if (!Character.isUpperCase(inputArray[i])) {
                        int diff = (int)(inputArray[i] - 'Z');
                        inputArray[i] = (char)('A' + diff - 1);
                    }
                } else if (Character.isLowerCase(inputArray[i])) {
                    inputArray[i] += K % 26;
                    if (!Character.isLowerCase(inputArray[i])) {
                        int diff = (int) (inputArray[i] - 'z');
                        inputArray[i] = (char) ('a' + diff - 1);
                    }
                }
            }
        }
        System.out.println(inputArray);
    }
}