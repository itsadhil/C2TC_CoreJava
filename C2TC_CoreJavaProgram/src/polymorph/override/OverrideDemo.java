package polymorph.override;

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//Late Binding, Dynamic Binding & Runtime Polymorphism.
		PLTraining p1 = new PLTraining();
		p1.session("FullStack Course");
		
		
		p1 = new JFSjava();
		p1.session("Method Overriding");
	
		p1 = new Python();
		p1.session("Python");
	
	}

}
