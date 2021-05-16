package com.portal.rhub.common;

import java.util.ArrayList;
import java.util.List;

public enum FacilityUI {
	
	No_Bond(1,"No Bond"),
	Laptop(2,"Laptop"),
	Cab(3,"Cab"),
	Health_Insurance(4,"Health Insurance"),
	Gym(5,"Gym"),
	Cafeteria(6,"Cafeteria"),
	Sponsor_Higher_studies(7,"Sponsor Higher studies");

	public final Integer id;  
	public final String label;
	  

	  FacilityUI(Integer id,String label) {
		  this.id = id;
		  this.label = label;
	  }

	  public List<String> getallFacilityUI(){
		  List allFacilities = new ArrayList<>();
		 for(FacilityUI instance: FacilityUI.values()) {
			 allFacilities.add(instance.label);
		 }
		return allFacilities;
	  }
}