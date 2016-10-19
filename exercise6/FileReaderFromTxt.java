import java.io.*;
import java.util.ArrayList;

class FileReaderFromTxt {
	
	public static void main(String[] arg) {
		File f = new File("D:\\Java\\exercises\\exercise6\\test.txt");
		try(FileReader reader = new FileReader(f))
		{
			
		
			char[] buffer = new char[(int)f.length()];
			reader.read(buffer);
			String stringFromFile = new String(buffer);
			stringFromFile = stringFromFile.replaceAll("[\\.,:;\\(\\)!?\\\\*]", " ");
			char[] chars = stringFromFile.toCharArray();
			
			
			System.out.println(chars.length);
			ArrayList<WordNumber> wordsNum = new ArrayList<WordNumber>();
			/*String forWord = "";
			
			
		
			while(i<chars.length) {
				while(i < chars.length && chars[i] != ' ') {
					forWord = forWord + chars[i];
					i++;
				}
				i++;
				
				WordsNum.add(new WordNumber(forWord,1));
				System.out.println(forWord);
				forWord = "";
			}*/
			int flag = 0;
			StringBuilder forWord = new StringBuilder();
			
			for (int i = 0; i < chars.length; i++) {
				if(chars[i] != ' ') {
					forWord.append(chars[i]);
					if(i == chars.length-1) {
						wordsNum.add(new WordNumber(forWord.toString(),1));
					}	
				} 
				else {
					if(chars[i-1] != ' '){
						for (int k = 0; k < wordsNum.size(); k++){
							if (forWord.toString().equals(wordsNum.get(k).word)){
								wordsNum.get(k).number++;
								flag=1;
								forWord.setLength(0);
								break;
							}
						}	
						System.out.println(flag);
						if (flag == 0) {
							wordsNum.add(new WordNumber(forWord.toString(),1));
							forWord.setLength(0);
						}	
					}
				}
				System.out.println(forWord.toString());
				flag = 0;
			}
			
			int j = 0;
			while (j < wordsNum.size()) {
				System.out.println(wordsNum.get(j).number + " " + wordsNum.get(j).word);
				j++;
			}
			
			System.out.println(stringFromFile);
			
		}
		catch(IOException ex){
				  
		System.out.println(ex.getMessage());
		}

	}
}