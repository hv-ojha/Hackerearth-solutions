import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class maximumBorder {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] tableData;

        int testcases = Integer.parseInt(br.readLine().trim());

        for(int i = 0; i < testcases; i++) {
            int[] table = Arrays.stream(br.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int count = 0, max = 0; 

            tableData = new char[table[0]][table[1]];

            for(int row = 0; row < table[0]; row++) {
                tableData[row] = br.readLine().toCharArray();
                count = 0;
                for(int col = 0; col < table[1]; col++) {
                    if(tableData[row][col] == '#')
                        count++;
                }
                if(count > max)
                    max = count;
            }

            System.out.println(max);
        }
    }
}