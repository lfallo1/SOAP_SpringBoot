package com.lance.wsdlfirst.services;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import com.lance.superheroes.AllSuperheroDetailsRequest;
import com.lance.superheroes.AllSuperheroDetailsResponse;
import com.lance.superheroes.Gender;
import com.lance.superheroes.GetSuperheroDetailsRequest;
import com.lance.superheroes.GetSuperheroDetailsResponse;
import com.lance.superheroes.Suit;
import com.lance.superheroes.Superhero;
import com.lance.superheroes.SuperheroPortType;

public class SuperheroServiceImpl implements SuperheroPortType {
	
	final List<Superhero> superheroes;

	public SuperheroServiceImpl(){
		Superhero superhero1 = new Superhero();
		superhero1.setAlias("Superman");
		superhero1.setName("clark");
		superhero1.setGender(Gender.M);
		superhero1.setPower(BigInteger.valueOf(5000));
		superhero1.setWeight(BigInteger.valueOf(221));
		superhero1.setHeight(BigInteger.valueOf(72));
		
		Suit suit1 = new Suit();
		suit1.setColor("blue");
		suit1.setDescription("red and blue suit");
		
		superhero1.getSuits().add(suit1);
		superheroes = Arrays.asList(superhero1);
	}
	
	@Override
	public AllSuperheroDetailsResponse allSuperheroDetails(AllSuperheroDetailsRequest parameters) {
		AllSuperheroDetailsResponse response = new AllSuperheroDetailsResponse();
		response.getSuperhero().addAll(superheroes);
		return response;
	}

	@Override
	public GetSuperheroDetailsResponse getSuperheroDetails(GetSuperheroDetailsRequest parameters) {
		GetSuperheroDetailsResponse response = new GetSuperheroDetailsResponse();
		response.setSuperhero(superheroes.get(0));
		return response;
	}

}
