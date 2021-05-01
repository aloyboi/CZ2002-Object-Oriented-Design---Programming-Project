package groupassignment;

import java.io.*;
import java.util.*;

public class ReadWriteFile {

 public static void writeToFile(String fileName, List allData) throws IOException {
	  PrintWriter output = new PrintWriter(new FileWriter(fileName));
	  try {
	   for (int i = 0; i < allData.size(); i++) {
	    output.println((String) allData.get(i));
	  }
	  } finally {
	  output.close();
	  }
}

public static List read(String fileName) throws IOException {
  List allData = new ArrayList();
  Scanner sc = new Scanner(new FileInputStream(fileName));
  try {
	   while (sc.hasNextLine()) {
	   allData.add(sc.nextLine());
	   }
  } finally {
	   sc.close();
  }
  return allData;
 }
}