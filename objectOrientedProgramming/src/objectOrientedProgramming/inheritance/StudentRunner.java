package objectOrientedProgramming.inheritance;

public class StudentRunner {

	public static void main(String[] args) {

		Student stud = new Student();

		stud.setName("Vinod Salunke");
		stud.setCollegeName("K.C College ,Thane");

		Person p1 = new Person();
		System.out.println(p1);
		System.out.println(p1.toString());

		System.out.println(stud.getCollegeName());
		System.out.println(stud);

	}

}
