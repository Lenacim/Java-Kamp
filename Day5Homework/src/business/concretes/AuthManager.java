package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import business.abstracts.UserValidationService;
import core.LoginWithEmail;
import entities.concretes.User;

public class AuthManager implements AuthService {
	
	AuthService authService;
	UserService userService;
	UserValidationService userValidationService;
	
	public AuthManager(AuthService authService, UserService userService, UserValidationService userValidationService) {
		super();
		this.authService = authService;
		this.userService = userService;
		this.userValidationService = userValidationService;
	}


	public AuthManager(Object object, LoginWithEmail loginWithEmail) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean register(User user) {
	    if(!(this.userService.checkMailCorrect(user.getEmail()) &&
                this.userService.getByEmail(user.getEmail()) == null &&
                user.getFirstName().length() >= 2 && user.getLastName().length() >= 2 &&
                user.getPassword().length() >= 6)){
            System.out.println("Kayýt baþarýsýz !");
            return false;
	
	}System.out.println("Mail gönderildi !");
    if(!authService.verified(user.getEmail())){
        System.out.println("Kodu doðru girmelisiniz!");
        return false;
    }
    System.out.println("Hesabýnýz onaylandý ve kaydýnýz yapýldý.");
    this.userService.add(user);
    return true;
	}

	@Override
	public boolean login(User user) {
		User userToCheck = this.userService.getByEmail(user.getEmail());
        if(userToCheck == null){
            System.out.println("Kayýtlý kullanýcý bulunamadý.");
            return false;
        }
        if(!user.getPassword().equals(userToCheck.getPassword())){
            System.out.println(" Parola yanlýþ !");
            return false;
        }
        System.out.println("Giriþ baþarýlý!");
        return true;
    }
	

	@Override
	public boolean verified(String email) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean verified(User user2) {
		// TODO Auto-generated method stub
		return false;
	}
	



	

	

	


}
