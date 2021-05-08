package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void update (User user);
	void delete(User user);
	void verifyUser(int id);
	User getId(User user2);
	User getByEmail(User user2);
	User getByEmailAndPassword(String email,String password);
	List<User> getAll();
	boolean checkMailCorrect(String email);
	User getId(int id);
	User getByEmail(String email);
	

}
