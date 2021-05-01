package odev2;

public class Instructor extends User{

	private String InstructorDescription;
	
	public Instructor() {
		
	}
	
	public Instructor(int id,int UserId, String FirstName, String LastName, String email, String password, String InstructorDescription){
		
	}


	public String getInstructorDescription() {
		return InstructorDescription;
	}

	public void setInstructorDescription(String instructorDescription) {
		InstructorDescription = instructorDescription;
	}
	
	
}
