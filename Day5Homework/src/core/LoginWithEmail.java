package core;



import business.concretes.UserManager;

public class LoginWithEmail implements EmailService{

	
	@Override
	public Boolean sendEmail(String mail) {
	    
		UserManager.Usersend(mail);
		return null; 
	}

	public void Verificate(String email) {
		// TODO Auto-generated method stub
		
	}

	public void loginWithEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean login(Object mail, String password) {
		// TODO Auto-generated method stub
		return false;
	}
 
}

