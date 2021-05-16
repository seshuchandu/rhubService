package com.portal.rhub.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portal.rhub.entity.JobPreference;

import jdk.jfr.Registered;
import lombok.RequiredArgsConstructor;


@RestController
public class JobPreferenceController {
	
	@GetMapping(value = "/jobPreference")
	  public String  getStatus() {
		return "OK";
	  }

	
	@GetMapping(value = "/getJpbykey")
	public List<JobPreference> getJPbyKey(String searchKey){
		return null;
	}
	
}
