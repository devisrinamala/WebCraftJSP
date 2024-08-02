package models;

public class student {

	private String pinnumber;
	private String name;
	private String email;
	private String branch;
	
	public String getpinnumber() {
		return pinnumber;
	}
	public void setpinnumber(String pinnumber) {
		this.pinnumber = pinnumber;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getbranch() {
		return branch;
	}
	public void setbranch(String branch) {
		this.branch = branch;
	}
	
	public student(String pinnumber,String name,String email,String branch) {
		super();
		this.pinnumber = pinnumber;
		this.name = name;
		this.email = email;
		this.branch = branch;
	}
	public student() {
		super();
	}
}
