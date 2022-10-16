package First;

public class Student {
	private String name;
	private String course;
	private int age;
	private Subject subject;
	
	
	
	  
	
	 public Student(String name, String course, int age, Subject subject) {
		
		this.name = name;
		this.course = course;
		this.age = age;
		this.subject = subject;
	}





	public void display() {
		 System.out.println(name);
		 System.out.println(course);
		 System.out.println(age);
		 System.out.println(subject.getSubjectName());
//		System.out.println("name :" + name + "course :" + course);
		 
		 
	 }





	



}
