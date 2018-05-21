package com.anilnayak.country.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.anilnayak.country.model.Country;
import com.anilnayak.country.service.CountryServiceImpl;

@Path("/country")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CountryController {

	CountryServiceImpl countryService = new CountryServiceImpl();

	@POST
	@Path("/addCountry")
	public Response addCountry(Country country) {
		return countryService.addCountry(country);
	}

	@DELETE
	@Path("/delete/{id}")
	public Response deleteCountry(@PathParam("id") int id) {
		return countryService.deleteCountry(id);
	}

	@GET
	@Path("/getCountryById/{id}")
	public Country getCountryById(@PathParam("id") int id) {
		return countryService.getCountryById(id);
	}

	@GET
	@Path("/getAllCountry")
	public Country[] getAllCountries() {
		return countryService.getAllCountries();
	}
}
