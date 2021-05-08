package core;

public class AuthenticatorAdapter implements AuthenticatorService{

	@SuppressWarnings("unused")
	@Override
	public Boolean singUpToSystem(String email, String password) {
		LoginWithEmail loginWithEmail =new LoginWithEmail();
		return null;
	}

}
