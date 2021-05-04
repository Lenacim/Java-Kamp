
public class User {
	public String identificationNumber;
	public String firstName;
	public String lastName;
	public String dateOfNumber;
	
	public User(String identificationNumber, String firstName, String lastName, String dateOfNumber) {
	
		this.identificationNumber = identificationNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfNumber = dateOfNumber;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfNumber() {
		return dateOfNumber;
	}

	public void setDateOfNumber(String dateOfNumber) {
		this.dateOfNumber = dateOfNumber;
	}

}
