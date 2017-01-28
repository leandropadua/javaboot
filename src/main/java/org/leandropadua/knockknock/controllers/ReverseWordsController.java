package org.leandropadua.knockknock.controllers;

import org.leandropadua.knockknock.models.StringReverser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseWordsController {

	@RequestMapping("/api/ReverseWords")
	public String reverseWordsInSentence(@RequestParam(name="sentence",required=false, defaultValue="") String sentence) {
		return StringReverser.reverse(sentence);
	}
}
