package com.fichafitness.exercise.api;

import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class HomeController {

	@GetMapping
	public String get() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return "Hello " + auth.getPrincipal();
	}

}
