package com.portal.rhub.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.portal.rhub.common.FacilityUI;

@RestController
public class UtilController {
	
	
	@GetMapping(value = "/getFacilities.json")
	public List getFacilities() { //test patter // need to change to DB call
		
		
		List allFacilities = new ArrayList<>();
		allFacilities.add(FacilityUI.Cab);
		allFacilities.add(FacilityUI.No_Bond);
		
		return allFacilities ;
	}

}
