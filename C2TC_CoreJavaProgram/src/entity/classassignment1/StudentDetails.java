package entity.classassignment1;

public class StudentDetails {
	private int stuid;
	private String StuName;
	private String Stulocation;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuName() {
		return StuName;
	}
	public void setStuName(String stuName) {
		StuName = stuName;
	}
	public String getStulocation() {
		return Stulocation;
	}
	public void setStulocation(String stulocation) {
		Stulocation = stulocation;
	}
	@Override
	public String toString() {
		return "StudentDetails [stuid=" + stuid + ", StuName=" + StuName + ", Stulocation=" + Stulocation + "]";
	}

}
