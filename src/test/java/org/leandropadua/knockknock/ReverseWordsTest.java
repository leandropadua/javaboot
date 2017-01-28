package org.leandropadua.knockknock;

import static org.junit.Assert.*;

import org.junit.Test;
import org.leandropadua.knockknock.controllers.ReverseWordsController;

public class ReverseWordsTest {

	private ReverseWordsController reverseWords = new ReverseWordsController();
	
	@Test
	public void reverseSingleWord() {
		String sentence = "Leandro";
		String expectedReversedSentence = "\"ordnaeL\"";
		assertEquals(expectedReversedSentence, reverseWords.reverseWordsInSentence(sentence));
	}
	
	@Test
	public void reverseMultipleWordsSentence() {
		String sentence = "Leandro eh legal";
		String expectedReversedSentence = "\"ordnaeL he lagel\"";
		assertEquals(expectedReversedSentence, reverseWords.reverseWordsInSentence(sentence));		
	}
	
	@Test
	public void reverseEmptyString() {
		String sentence = "";
		String expectedReversedSentence = "\"\"";
		assertEquals(expectedReversedSentence, reverseWords.reverseWordsInSentence(sentence));		
	}
}
