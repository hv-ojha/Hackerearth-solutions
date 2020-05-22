import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Rahul is a good student  but has less coding skill, and he is placed in a company "datora" this year. 
 * And as his first task he has been given to write some code to organize a database table from user input as similar to SQL table shows in command prompt (terminal). 
 * He has to code as requirements.
 * 1. There are only four data types
 * 
 *  (a). "string" contains only alphabets without space.
 *  (b). "integer" contains only numeric
 *  (c). "date" which contain "dd/mm/yyyy" format
 *  (d). "boolean" which contain one of two values "true" or "false"
 * 
 * 2. all field data should fit into its corresponding cell
 * 
 * 3. string ,date and boolean are stored in table as left aligned with a space and integer is right alligned with a space
 * 
 * But you know he is weak in coding so you have to help him to do so.
 * 
 * Constraints
 * First line of input define number of tables T, 1<= T <=200
 * 
 * For each T first line will have two integer separeted by a space m and n, m is the number attributes, n is the number of touples
 * 
 * Next line contains m number of strings defining name of each attribute
 * 
 * Next n line will contain exactly m number of values (string, integer, date, boolean)
 * Note
 * 
 * No string will be length of more than 30 characters and integer more than 20 digits
 */

public class database {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(new File("input1.txt"));
        BufferedReader br = new BufferedReader(fr);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-- > 0) {
            int[] numbers = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            int rows = numbers[1] + 1;
            String[][] values = new String[rows][numbers[0]];
            int[] maxValues = new int[numbers[0]];
            for(int i = 0; i < rows; i++) {
                values[i] = br.readLine().trim().split(" ");
                for(int j = 0; j < numbers[0]; j++)
                    if(values[i][j].length() > maxValues[j])
                        maxValues[j] = values[i][j].length();
            }
            StringBuilder op = outputGenerator(values, rows, numbers[0], maxValues);
            System.out.println(op);
        }
    }
    public static StringBuilder outputGenerator(String[][] values, int rows, int cols, int[] maxValues) {
        StringBuilder output = new StringBuilder();
        StringBuilder plus = plusGenerator(cols, maxValues);
        output.append(plus);
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                output.append("| ");
                if(isNumber(values[i][j])) {
                    if(values[i][j].length() < maxValues[j]) {
                        for(int k = 0; k < maxValues[j] - values[i][j].length(); k++)
                            output.append(" ");
                    }
                    output.append(values[i][j]);
                }
                else {
                    output.append(values[i][j]);
                    if(values[i][j].length() < maxValues[j]) {
                        for(int k = 0; k < maxValues[j] - values[i][j].length(); k++)
                            output.append(" ");
                    }
                }
                output.append(" ");
            }
            output.append("|\n");
            if(i == 0)
                output.append(plus);
        }
        output.append(plus);
        return output;
    }
    public static StringBuilder plusGenerator(int cols, int[] maxValues) {
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < cols; i++) {
            output.append("+-");
            for(int j = 0; j < maxValues[i]; j++)
                output.append("-");
            output.append("-");
        }
        output.append("+\n");
        return output;
    }
    public static boolean isNumber(String str) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        return pattern.matcher(str).matches();
    }
}