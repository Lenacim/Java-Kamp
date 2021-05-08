package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao  implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kayýt olundu:"+ User.getFirstName()+ user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	
	public User getByEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getByEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	
	@Override
	public boolean checkMail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

}
