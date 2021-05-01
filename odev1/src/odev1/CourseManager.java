package odev1;

public class CourseManager {
	 public void sendEmail(Course course) {
         System.out.println("Kursunuz başarı ile eklendi :  \n" + course.name + " - " 
	 + course.instructor +" - " + course.educationtime +"\n");
     }
}
