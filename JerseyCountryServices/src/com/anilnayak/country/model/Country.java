package com.anilnayak.country.model;

public class Country {

	private int id;
	private String countryName;
	private String populations;
	
	

	public Country() {
		super();
	}


	public Country(int id, String countryName, String populations) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.populations = populations;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public String getPopulations() {
		return populations;
	}


	public void setPopulations(String populations) {
		this.populations = populations;
	}


	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName + ", populations=" + populations + "]";
	}


	

}
