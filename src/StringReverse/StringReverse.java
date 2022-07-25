/**

Reverse a String

Write a program to take a string as input and output its reverse.
The given code takes a string as input and converts it into a char array, which contains letters of the string as its elements.

Sample Input:
hello there

Sample Output:
ereht olleh

*/


package StringReverse;

import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
