package com.anilnayak.country.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.Response;

import com.anilnayak.country.model.Country;
import com.anilnayak.country.model.GenericResponse;

public class CountryServiceImpl implements CountryService {

	public static Map<Integer, Country> mapCountry = new HashMap<>();

	@Override
	public Response addCountry(Country country) {
		GenericResponse response = new GenericResponse();
		if (mapCountry.get(country.getId()) != null) {
			response.setStatus(false);
			response.setMessage("Country Already exist with this Id");
			response.setErrorCode("EC-01");
			return Response.status(422).entity(response).build();
		}
		mapCountry.put(country.getId(), country);
		response.setStatus(true);
		response.setMessage("Country Added Successfully");
		return Response.ok(response).build();
	}

	@Override
	public Response deleteCountry(int id) {
		GenericResponse response = new GenericResponse();
		if (mapCountry.get(id) == null) {
			response.setStatus(false);
			response.setMessage("Country does not exist with this ID");
			response.setErrorCode("EC-02");
			return Response.status(404).entity(response).build();
		}
		mapCountry.remove(id);
		response.setStatus(true);
		response.setMessage("Country deleted Successfully");
		return Response.ok(response).build();
	}

	@Override
	public Country getCountryById(int id) {
		return mapCountry.get(id);
	}

	@Override
	public Country[] getAllCountries() {
		Set<Integer> keySet = mapCountry.keySet();
		System.out.println("KeysSet:::"+keySet);
		Country[] country = new Country[keySet.size()];
		int i = 0;
		for (Integer ids : keySet) {
			country[i] = mapCountry.get(ids);
			i++;
		}
		return country;
	}

}
