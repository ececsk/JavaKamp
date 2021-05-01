
public class Course //özellik tutucu
{
int id;
String courseName;
String teacherName;

public Course() {
	//System.out.println("Özellik tutan class calisti");
}
public Course(int id,String courseName,String teacherName) {
	this.id = id; 
	this.courseName = courseName;
	this.teacherName = teacherName;
}
}
