package business.abstracts;

import entities.concretes.User;

public interface AuthService {

   boolean register(User user);
	  
	boolean login(User user);

	boolean verified(User user2);

	boolean verified(String email);


	
	}



