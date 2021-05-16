package com.portal.rhub.common;

public enum ExperienceType {

	Fresher(1,"Fresher"),
	Experienced(2,"Experienced");

	public final String label;
	public final Integer id;

	ExperienceType(Integer id,String label) {
		this.id = id;
		this.label = label;
	}
}
