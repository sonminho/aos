package dto;

public class MemberVO {
	private String token;
	private String userid;
	private String pwd;
	private String email;
	private String phone;
	private int connectId;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getConnectId() {
		return connectId;
	}
	
	public void setConnectId(int connectId) {
		this.connectId = connectId;
	}
}
