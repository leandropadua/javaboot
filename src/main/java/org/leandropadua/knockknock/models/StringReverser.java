package org.leandropadua.knockknock.models;

public class StringReverser {

	public static String reverse(String sentence) {

		//Reverse every word in a sentence and keep the spaces
		StringBuilder reversedString = new StringBuilder();
		String reversedWord = "";
		for(char c: sentence.toCharArray()) {
			
			//When current char is not blank, invert the word
			if(c != ' ') {
				reversedWord = c + reversedWord;
			}
			
			//When current char is blank, concatenate the inverted word and keep spaces
			if(c == ' ') {
				reversedString.append(reversedWord).append(" ");
				reversedWord = "";
			}
		}
		
		//Append last word
		if(reversedWord != "") {
			reversedString.append(reversedWord);
		}
		
		//The returned string must have quotes
		return "\"" + reversedString.toString() + "\"";
	}

}
