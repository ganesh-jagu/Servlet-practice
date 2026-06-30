package UsersData;

public class users {
	private int uid;
	private String uname;
	private String course;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "users [uid=" + uid + ", uname=" + uname + ", course=" + course + "]";
	}
	

}
