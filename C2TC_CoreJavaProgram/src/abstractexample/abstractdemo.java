package abstractexample;

public abstract class abstractdemo {
	protected static final String Wakeup = "5 Am";
	
	//abstract method declared
	abstract public void rules(); 
	
	//concrete method
	public void show() {
		System.out.println("To Become a Coder, You need to wake up early in the morning to work on yourself");
	}
}
