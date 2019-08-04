package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
	
	String firstName;
	String lastName;
	String country;
	
	private Map<String,String> countryOptions;
	
	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	private String favoriteLanguage;
	private String[] operatingSystems;

	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brasile");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "USA");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
}
