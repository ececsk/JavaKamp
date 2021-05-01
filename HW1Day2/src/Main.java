
public class Main {

	public static void main(String[] args) {
		Course course1=new Course();
		course1.id=1;
		course1.courseName="Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + ANGULAR)";
		course1.teacherName="Engin Demiro�";
		
		Course course2=new Course(); 
		course2.id=2;
		course2.courseName="Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JAVA + REACT)";
		course2.teacherName="Engin Demiro�";
		
		Course course3=new Course(); 
		course3.id=3;
		course3.courseName="Programlamaya Giri� i�in Temel Kurs";
		course3.teacherName="Engin Demiro�";
		
		Course[] courses={course1,course2,course3};
		
		System.out.println("T�M KURSLAR");
			
		for (Course course : courses) { 
				System.out.println("Kurs ID: "+course.id+"Kurs Ad�: "+course.courseName+ "E�itmen: "+course.teacherName);
				System.out.println("------");
		}
		
		CourseManager courseManager1=new CourseManager();
		courseManager1.Add(course1.courseName);
		
		CourseManager courseManager2=new CourseManager();
		courseManager2.Add(course2.courseName);
		
		courseManager1.Delete(course1.courseName);
		
	}

}
