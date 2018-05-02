package org.code.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaEndoffile {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while(scan.hasNext()) {
            String s = scan.nextLine();
            System.out.println(++count + " " + s);
        }
        scan.close();
    }
}
