package SimpleArraySum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleRandomArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int e = 0;
        for (int a:ar) {
            e += a;
        }
        return e;
    }

    public static void main(String[] args) {
        System.out.println("Please Enter the Array length:");

        Scanner in = new Scanner(System.in);
        int al = in.nextInt();

        System.out.println("Enter the " + al + " array  list values");

        List<Integer> list = new ArrayList<>(al);

        for (int i = 0; i < al; i++) {
            list.add(in.nextInt());
        }

        System.out.println(SimpleRandomArraySum.simpleArraySum(list));


//        int[] a = new int[al];
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.print("Value of the a["+i+"] = ");
//            a[i] = in.nextInt();
//        }
//
//        for (int e : a) {
//            System.out.println(e + " ");
//        }


    }
}
