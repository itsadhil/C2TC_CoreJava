package entity.classassignment2;

public class ItemdetailsMain {
	public static void main(String[] args) {
		ItemDetails i1 = new ItemDetails();
		i1.setItemid(001);
		i1.setItemName("Candy");
		i1.setItemStore("ASK Mart");
		i1.setItemLocation("Cuddalore");
		System.out.println(i1);
		
		ItemDetails i2 = new ItemDetails();
		i2.setItemid(002);
		i2.setItemName("Dough");
		i2.setItemStore("HEHE Mart");
		i2.setItemLocation("Puducherry");
		System.out.println(i2);
		
		ItemDetails i3 = new ItemDetails();
		i3.setItemid(003);
		i3.setItemName("Shampoo");
		i3.setItemStore("JK Stores");
		i3.setItemLocation("Marakaanam");
		System.out.println(i3);
		
		ItemDetails i4 = new ItemDetails();
		i4.setItemid(004);
		i4.setItemName("Appy Fizz");
		i4.setItemStore("Ding Dong Mart");
		i4.setItemLocation("Dubai");
		System.out.println(i4);
		
	}
}
