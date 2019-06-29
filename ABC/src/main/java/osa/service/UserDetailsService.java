package osa.service;

import osa.dao.UserDetailsDao;
import osa.entity.UserDetailsEntity;

public class UserDetailsService {

	UserDetailsDao udd=new UserDetailsDao();
	public boolean checkIfUserAlreadyExists(String name) {
		
		return udd.checkUser(name);
	}

	public void registerUser(String name, String pass) {
		
		UserDetailsEntity ud = new UserDetailsEntity(name, pass);
		
		udd.addUser(ud);
		
	}

}
