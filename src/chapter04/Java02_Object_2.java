package chapter04;

public class Java02_Object_2 {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.name="Kobe";
		teacher.teach();
		
		Student student = new Student();
		student.name= "Lavine";
		student.study();

}
}
class Teacher{
	String name;
	void teach() {
		System.out.println("Teacher "+name+" is teaching");
	}
}
class Student{
	String name;
	
	void study() {
		System.out.println("Student "+name+" is studying");
	}

}