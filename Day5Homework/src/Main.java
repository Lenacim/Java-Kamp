
import business.abstracts.AuthService;
import business.abstracts.UserService;
import business.concretes.AuthManager;
import business.concretes.UserManager;
import core.LoginWithEmail;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Emir", "KÜÇÜK", "emir.kucuk747@gmail.com", "123456", false);
		User user2 = new User(2, "Aleyna", "ISNIK", "aleynaisnik@outlook.com", "1234", false);
		AuthService authService = new AuthManager( null, new LoginWithEmail());
		UserService userService = new UserManager(null);
		
		userService.add(user1);
		userService.delete(user1);
		userService.update(user1);
	
	    userService.getId(user2);
	    userService.getByEmail(user2);
	    userService.getByEmailAndPassword(null, null);
		authService.register(user2);
		authService.login(user2);
		authService.verified(user2);
		

	}

}

