import java.io.*;
import java.util.*;

class FileReaderEasy {
	
	public static void main(String[] arg) {
		File f = new File("D:\\Java\\exercises\\exercise6\\test.txt");
		try(FileReader reader = new FileReader(f))
		{
		
		char[] buffer = new char[(int)f.length()];
			reader.read(buffer);
			String stringFromFile = new String(buffer);
			stringFromFile = stringFromFile.replaceAll("[\\.,:;\\(\\)!?\\\\*]", " ");
			
			Map<String, Integer> wordToCount = new HashMap<>();
			String[] words = stringFromFile.trim().split("\\s+");
			for(String word : words) {
				Integer count = wordToCount.get(word);
				if(count == null) {
					count = 0;
				}
				wordToCount.put(word, count + 1);
			}
			for(String word : wordToCount.keySet()) {
				System.out.println("" + wordToCount.get(word) + " " + word);
			}
		}
		catch(IOException ex){
				  
		System.out.println(ex.getMessage());
		}

	}
}