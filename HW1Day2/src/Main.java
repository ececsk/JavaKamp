
public class Main {

	public static void main(String[] args) {
		Course course1=new Course();
		course1.id=1;
		course1.courseName="Yazýlým Geliþtirici Yetiþtirme Kampý(C# + ANGULAR)";
		course1.teacherName="Engin Demiroð";
		
		Course course2=new Course(); 
		course2.id=2;
		course2.courseName="Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA + REACT)";
		course2.teacherName="Engin Demiroð";
		
		Course course3=new Course(); 
		course3.id=3;
		course3.courseName="Programlamaya Giriþ için Temel Kurs";
		course3.teacherName="Engin Demiroð";
		
		Course[] courses={course1,course2,course3};
		
		System.out.println("TÜM KURSLAR");
			
		for (Course course : courses) { 
				System.out.println("Kurs ID: "+course.id+"Kurs Adý: "+course.courseName+ "Eðitmen: "+course.teacherName);
				System.out.println("------");
		}
		
		CourseManager courseManager1=new CourseManager();
		courseManager1.Add(course1.courseName);
		
		CourseManager courseManager2=new CourseManager();
		courseManager2.Add(course2.courseName);
		
		courseManager1.Delete(course1.courseName);
		
	}

}
