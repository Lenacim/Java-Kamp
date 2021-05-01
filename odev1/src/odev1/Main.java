package odev1;



    public class Main {
	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Programlamaya Giriþ Ýçin Temel Kurs", "Engin Demiroð","5 saat");
		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý(C# + ANGULAR)", "Aleyna Isnýk","50 saat");
		Course course3 = new Course(3,"Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA+REACT)", "Emir Küçük","100 saat");
		 
		
	
        
          
        CourseManager courseManager = new CourseManager();
        
  		courseManager.sendEmail(course1);
  		
  		courseManager.sendEmail(course2);
  		
  		courseManager.sendEmail(course3);
		
		
	}

}
