package com.portal.rhub.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		for(FacilityUI instance: FacilityUI.values()) {
			 allFacilities.add(instance.label);
		 }
		return allFacilities ;
	}
	
	@GetMapping(value = "/getFacilitiesMap.json")
	public Map<String, String> getFacilitiesMap() { //test patter // need to change to DB call
		
		Map<String,String> facilityMap = new HashMap<>();
		for(FacilityUI instance: FacilityUI.values()) {
			facilityMap.put(String.valueOf(instance.id),instance.label);
		 }
		return facilityMap ;
	}

}
