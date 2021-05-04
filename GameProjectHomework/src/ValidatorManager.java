
public class ValidatorManager implements ValidatorService{

	@Override
	public boolean validate(User user, Gamer gamer) {
		if(user.getIdentificationNumber() == gamer.getIdentificationNumber()) {
			System.out.println("Kullanýcý doðrulandý!");
			
			return true;
			
		}else {
			System.out.println("Kullanýcý doðrulanamadý!");
			
			return false;
		}
		
	
	}

}
