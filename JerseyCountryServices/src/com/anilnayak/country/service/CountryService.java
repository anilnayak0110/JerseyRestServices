package com.anilnayak.country.service;




import javax.ws.rs.core.Response;

import com.anilnayak.country.model.Country;

public interface CountryService {
	
	@SuppressWarnings("rawtypes")
	public Response addCountry(Country country);
	@SuppressWarnings("rawtypes")
	public Response deleteCountry(int id);
	public Country getCountryById(int id);
	public Country[] getAllCountries();

}
