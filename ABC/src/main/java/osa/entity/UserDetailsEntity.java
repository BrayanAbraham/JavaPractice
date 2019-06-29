package osa.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class UserDetailsEntity {
	@Id String name;
	@Index String pass;
	
	
	
	
	public UserDetailsEntity() {
		super();
	}




	public UserDetailsEntity(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	
	

}
