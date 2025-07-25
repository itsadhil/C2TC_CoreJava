package day5.practice;

public class Trainer extends Person {	
	
	private String session;
	private String designation;
	private String batchno;
	public Trainer(int pid,String name,String city, String session, String designation, String batchno) {
		super(pid,name,city);
		this.session = session;
		this.designation = designation;
		this.batchno = batchno;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	@Override
	public String toString() {
		return "Trainer [Trainer ="+ super.getPid() +" Trainer Name ="+ super.getName() +" Trainer City = "+ super.getCity() +" session=" + session + ", designation=" + designation + ", batchno=" + batchno + "]";
	}
}
