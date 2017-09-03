// a new for git.
// http://opencsv.sourceforge.net/apidocs/com/opencsv/CSVWriter.html

package com.kondor.TestArrayWriter;

import com.opencsv.CSVWriter;
import java.io.*;
import java.util.Arrays;

public class ArrayWriter {
	public static void main(String arg[]){
	    CSVWriter writer;
		try {
			writer = new CSVWriter(new FileWriter("yourfile.csv"));
		    // feed in your array (or convert your data to an array)
		    String[] entries = "first#second#third".split("#");
		    writer.writeNext(entries);
		    String[] entries2 = "first2#second2#third3".split("#");
		    writer.writeNext(entries2);
		    
		    writer.close();
		    System.out.println(Arrays.toString(entries2));	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}
 
	
}
