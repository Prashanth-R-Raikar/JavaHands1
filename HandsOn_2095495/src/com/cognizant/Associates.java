
import java.util.Date;

public class Associates {

	private int id;
	private String name;
	private String email;
	private long mobile;
	private Date joinDate;
	public Associates() {
		super();
		
	}
	public Associates(int id, String name, String email, long mobile, Date joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.joinDate = joinDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Associates [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", joinDate="
				+ joinDate + "]";
	}
	
	
}
