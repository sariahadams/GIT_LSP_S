package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class assignment2 {

	public static void main(String[] args) {
		WordCountFileReader filename = new WordCountFileReader();
		
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		
		try {
			String filepath = filename.readToString("words.txt"); //Obtaining file path
			System.out.println(filepath);
			
			String[] separated = filepath.toLowerCase().split(" ");
			for (int x = 0; x < separated.length; x++) {
				if (separated[x].length() > 3 && !separated[x].equals(",")) {
					if (hashmap.get(separated[x]) == null) {
						hashmap.put(separated[x], 1); //setting number of occurrences to one
					} else {
						hashmap.put(separated[x], hashmap.get(separated[x]) + 1); //increases occurrences
					}
				}
			}
			for (String i : hashmap.keySet()) {
				System.out.println(i + ": " + hashmap.get(i));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found in directory");
		}
	}

}


