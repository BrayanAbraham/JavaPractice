package osa;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

public class OfyService {
	
	static
	{
		ObjectifyService.register(UserDetails.class);
	}
	
	public static Objectify ofy()
	{
		return ObjectifyService.ofy();
	}

}
