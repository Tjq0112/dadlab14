package exercise3;

import java.util.Date;

/**
 * This class generates word count.
 * 
 * @author Teoh Jia Qi
 *
 */
public class TextGenerator {
	
public String getWordCount() {
		
	String text = "Java is difficult";
	
	String[] wordNum = text.split("\\s+");
	String wordCount = Integer.toString(wordNum.length);
	
	return wordCount;	
	}

	
	
}
