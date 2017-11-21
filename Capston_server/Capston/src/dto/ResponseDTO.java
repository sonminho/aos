package dto;

public class ResponseDTO {
	private String rDate;
	private String rUserid;
	private String rMsg;
	
	public String getrDate() {
		return rDate;
	}
	public void setrDate(String rDate) {
		this.rDate = rDate;
	}
	public String getrUserid() {
		return rUserid;
	}
	public void setrUserid(String rUserid) {
		this.rUserid = rUserid;
	}
	public String getrMsg() {
		return rMsg;
	}
	public void setrMsg(String rMsg) {
		this.rMsg = rMsg;
	}
}
