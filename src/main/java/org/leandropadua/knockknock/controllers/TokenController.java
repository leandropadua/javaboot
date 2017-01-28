package org.leandropadua.knockknock.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

	@RequestMapping("/api/Token")
	public String getToken() {
		return "\"\"";
	}
}
