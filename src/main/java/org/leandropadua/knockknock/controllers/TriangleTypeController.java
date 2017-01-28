package org.leandropadua.knockknock.controllers;

import org.leandropadua.knockknock.models.TriangleIdentifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriangleTypeController {
	
	@RequestMapping("/api/TriangleType")
	public String getTriangleType(@RequestParam(name="a",required=true) int a,
			@RequestParam(name="b",required=true) int b,
			@RequestParam(name="c",required=true) int c) {
		return TriangleIdentifier.identifyTriangleType(a,b,c);
	}
}
