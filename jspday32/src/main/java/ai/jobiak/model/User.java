package ai.jobiak.model;

public class User {
private String fname;
private String email;
private String mobile;
public User() {
	// TODO Auto-generated constructor stub
}
public User(String fname, String email, String mobile) {
	super();
	this.fname = fname;
	this.email = email;
	this.mobile = mobile;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "User [fname=" + fname + ", email=" + email + ", mobile=" + mobile + "]";
}


}
