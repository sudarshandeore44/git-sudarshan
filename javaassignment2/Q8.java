package Practice;

public class Student {


 private int rollNo;

 private String name;

 private String course ;

 private int marks;

 private char grade;

 private String result;


	public void acceptDetails(int rollNO, String name, String course, int marks) {

	

	this.rollNo = rollNO;

	this.name = name;

	this.course = course;

	this.marks = marks;

	

}

	public void calGrade() {

		if(marks>90) {

		grade='A';

		}

	  if(marks>80&& marks<=90) {

		  grade='B';

		  

				  }

	  if(marks>70&& marks<=80) {

		  grade='C';

	}

	  if(marks>60&& marks<=70) {

		  grade='D';

		  }



	  if( marks<60) {

		  grade='f';

		  }

	}

	

	

	public void calResult() {

		if(marks>60) {

		  result="pass";

			}

		else

			result="fail";

	}

	

 public void display() {

	 System.out.println("rollno is "+rollNo);

	 System.out.println("name is "+name);

	 System.out.println("course is "+course);

	 System.out.println("marks is "+marks);

	 System.out.println("grade is "+grade);

	 System.out.println("result is "+result);

	 

 }

	public static void main(String[] args) {

       Student s1=new Student();

       s1.acceptDetails(1, "priyanka","cdac", 88);

       s1.calGrade();

       s1.calResult();

       s1.display();

	}



}



