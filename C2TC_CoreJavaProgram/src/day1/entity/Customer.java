package day1.entity;

public class Customer {
	private int cid;
	private String name;
	private String city;
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public int getCid() {
		return this.cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", city=" + city + ", getCid()=" + getCid() + ", getName()="
				+ getName() + ", getCity()=" + getCity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


}
