package osa.service;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

import osa.entity.UserDetailsEntity;

public class OfyService {
	
	static
	{
		ObjectifyService.register(UserDetailsEntity.class);
	}
	
	public static Objectify ofy()
	{
		return ObjectifyService.ofy();
	}

}
