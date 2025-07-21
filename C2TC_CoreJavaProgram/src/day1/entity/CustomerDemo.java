package day1.entity;

public class CustomerDemo {

	public static void main(String[] args) {
		//Customer 1
		Customer c1 = new Customer();
		c1.setCid(101);
		c1.setName("raja");
		c1.setCity("Puducherry");
		System.out.println(c1);
		
		Customer c2 = new Customer();
		c2.setCid(102);
		c2.setName("Om Prakash");
		c2.setCity("Puducherry");
		System.out.println(c2);
	}
	
	
}
