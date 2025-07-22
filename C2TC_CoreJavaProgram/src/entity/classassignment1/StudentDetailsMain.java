package entity.classassignment1;

public class StudentDetailsMain {

	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails();
		s1.setStuid(001);
		s1.setStuName("Adhil A");
		s1.setStulocation("Puducherry");
		System.out.println(s1);
		
		StudentDetails s2 = new StudentDetails();
		s2.setStuid(002);
		s2.setStuName("Suriya");
		s2.setStulocation("Saram");
		System.out.println(s2);
		
		StudentDetails s3 = new StudentDetails();
		s3.setStuid(003);
		s3.setStuName("Sabari");
		s3.setStulocation("Cuddalore");
		System.out.println(s3);
	}

}
