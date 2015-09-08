/**
 * Author: Brandon B.
 * Date: 9-4-15
 */

import java.io.*;
import java.util.*;

public class inputFromKeyboard {
    
    public static void main(String[] args) {
    	int i;
    	double d;
    	String s;
    	Scanner kbReader = new Scanner(System.in);
    	
    	System.out.print("Enter your integer here: ");
    	i = kbReader.nextInt();
    	System.out.println(3 * i);

    	System.out.print("Enter your decimal number here: ");
    	d = kbReader.nextDouble();
    	System.out.println(3 * d);

		System.out.print("Enter your string here: ");
		s = kbReader.next(); // Reads up until whitespace.
		System.out.println("This is the first part of the string: " + s);
		s = kbReader.next();
		System.out.println("This is the second part: " + s);
    }
}
