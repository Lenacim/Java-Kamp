package odev2;

public class StudentManager extends UserManager {
	public void getList(Student[] students) {
		for(Student student: students) {
			System.out.println("Ögrenci : "+" "+student.getFirstName()+" "+student.getLastName()+" " +student.email+" "+" eklendi!");
		}
		
	}
	
	
	


}
