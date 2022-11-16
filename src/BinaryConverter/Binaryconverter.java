package BinaryConverter;

import java.util.Scanner;

public class Binaryconverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int x = sc.nextInt();

//        StringBuilder binary = new StringBuilder();
        int rem;
        String binary = "";
        while (x >= 1) {
            rem = x % 2;
//            System.out.println("rem=="+x);
            binary = rem + binary;
//            binary.append(rem);  <- use this statement to remove warning
            x = x / 2;
        }
        System.out.println(binary);
    }
}
