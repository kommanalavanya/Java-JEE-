package ai.jobiak.model;

public class Contact {
	private String cname;
	private int cid;
	private String phoneno;
	private String email;
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	
	public Contact(String cname, int cid, String phoneno, String email) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.phoneno = phoneno;
		this.email = email;
	}

	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [cname=" + cname + ", cid=" + cid + ", phoneno=" + phoneno + ", email=" + email + "]";
	}
	
}
