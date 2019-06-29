package osa.dao;

import osa.entity.UserDetailsEntity;
import static osa.service.OfyService.ofy;

public class UserDetailsDao {

	public boolean checkUser(String name) {
		
		UserDetailsEntity ud = ofy().load().type(UserDetailsEntity.class).id(name).now();
		
		if(ud!=null)
			return true;
		else
			return false;
	}

	public void addUser(UserDetailsEntity ud) {
		
		ofy().save().entity(ud).now();
		
	}

}
