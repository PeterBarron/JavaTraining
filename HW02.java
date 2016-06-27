import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Comparator;

import java.util.*;

public class HW02 {

		// Task 01
	public static int getSumOfNumbers(String s) {
        /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */

		String stringWithNumbers = s + " ";		/* add a space on the end so we can assume when we match a number it always has a space after it */
		String pattern = "[0-9]+ ";				/* one or more numeric digits followed by a space */
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(stringWithNumbers);
		Integer sumOfNumbers = 0;
		Integer oneNumber;

		while (m.find()) {
			oneNumber = Integer.parseInt(stringWithNumbers.substring(m.start(), m.end()-1));

			sumOfNumbers+=oneNumber;
		}
		return sumOfNumbers;
	}
	
	// Task 02
	public static void sortIgnoringSpaces(String[] a) {
        /*
          Please implement this method to
          sort a given array of Strngs in alphabetical order
          ignoring spaces (' ' symbols) within the strings.
         */
		Arrays.sort(a, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.trim().compareTo(o2.trim());                                 /* Integer.compare(o1, o2); */
			}
		});

    }
	
	

}
