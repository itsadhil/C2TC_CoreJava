package day1.entity;

public class CustomerDemo {

	public static void main(String[] args) {
		//Customer 1
		Customer c1 = new Customer();
		c1.cid = 101;
		c1.name = "raja";
		c1.city = "Puducherry";
		System.out.println("Customer id:" + c1.cid);
		System.out.println("Customer name:" + c1.name);
		System.out.println("Customer city :" + c1.city);
		
		//Customer 2
		Customer c2 = new Customer();
		c2.cid = 102;
		c2.name = "Om Prakash";
		c2.city = "Puducherry";
		System.out.println("Customer id:" + c2.cid);
		System.out.println("Customer name:" + c2.name);
		System.out.println("Customer city :" + c2.city);
		

	}

}
