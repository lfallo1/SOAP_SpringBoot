package com.lance.wsdlfirst.services;

import java.math.BigInteger;

import com.bharaththippireddy.userprofile.ConvertFeetToYardsRequest;
import com.bharaththippireddy.userprofile.ConvertFeetToYardsResponse;
import com.bharaththippireddy.userprofile.UserProfilePortType;
import com.bharaththippireddy.userprofile.schema.userprofile.Address;
import com.bharaththippireddy.userprofile.schema.userprofile.UserProfile;

public class UserProfileServiceImpl implements UserProfilePortType {

	@Override
	public UserProfile getUserProfile(String userName) {
		UserProfile profile = new UserProfile();
		Address address = new Address();
		address.setCity("baltimore");
		address.setCountry("USA");
		address.setState("MD");
		address.setZipcode("21234");
		address.setStreetAddress("7919 westmoreland");
		profile.setAddress(address);
		profile.setEmail("fallon@gmail.com");
		profile.setUserName("lfallo1");
		return profile;
	}

	@Override
	public ConvertFeetToYardsResponse convertFeetToYards(ConvertFeetToYardsRequest params) {
		ConvertFeetToYardsResponse response = new ConvertFeetToYardsResponse();
		response.setYards(params.getFeet().divide(BigInteger.valueOf(3)));
		return response;
	}

}
