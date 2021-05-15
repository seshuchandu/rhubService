package main.java.com.portal.rhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/")
@RequiredArgsConstructor
public class JobPreferenceController {
	
	@GetMapping(value = "/jobPreference/")
	  public String  getStatus() {
	    return "OK";
	  }

}
