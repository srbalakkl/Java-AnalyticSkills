package SimpleArraySum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleSequenceArraySum {
    /**
     * Input: 1,2,3,4,5 (sequence order form 1 to n )
     * Output: 15
     */
    public static String simpleSequenceArraySum(List<Integer> list) {
        // Write your code here
        StringBuilder str = new StringBuilder();
        for (int e : list) {
            str.append(e).append("+");
        }
        int n = (list.get(list.size()-1));
        int op = n*(n+1)/2;//<-This formula will work only for numbers that start with 1 in a sequence order.

        return str+" ="+op;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int start = 1;
        int end = 0;

        System.out.println("Enter the Ending Number of the Sequence");
        if (in.hasNextInt()) {
            end = in.nextInt();
        }

        while (start <= end) {
            list.add(start);
            start++;
        }

        System.out.println(SimpleSequenceArraySum.simpleSequenceArraySum(list));

    }
}
