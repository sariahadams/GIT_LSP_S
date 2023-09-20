package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class WordCountFileReader {
  public WordCountFileReader() {
	  System.out.println("This is a Constructor!");
	  
  }
  public String readToString(String resource) throws FileNotFoundException {
    URL url = getClass().getClassLoader().getResource(resource);

    if (url != null) {
      File file = new File(url.getPath());

      Scanner sc = null;
      try {
        sc = new Scanner(file);
        StringBuilder output = new StringBuilder();
        while (sc.hasNextLine()) {
          output.append(sc.nextLine()).append(" ");
        }
        return output.toString();
      } finally {
        if (sc != null) {
          sc.close();
        }
      }
    }

    throw new FileNotFoundException();
  }
}

