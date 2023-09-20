package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;

public class WordCounterDriver {
	
	public static void main(String[] args) {
		WordCountFileReader fr = new WordCountFileReader();
		try {
			System.out.println(fr.readToString("words.txt"));
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}
	}
}

