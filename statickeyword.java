package javarogramming;
class Student{
	String name;
	static int studentcount;

	Student(String name){
		this.name = name;
		studentcount++;
		
	}
	public static int getStudentCount(){
		return studentcount;
	}
	public  void getStudentDetails() {
		System.out.println(this.name);
		
	}
}
public class statickeyword {
	public static void main(String[]args) {
		Student s1 = new Student("l");
		s1.getStudentDetails();
		Student s2 = new Student("l1");
		s2.getStudentDetails();
		Student s3 = new Student("l2");
		s3.getStudentDetails();
		int x = Student.getStudentCount();
		System.out.println("student count  = "+ x);
		
		
	}

}
