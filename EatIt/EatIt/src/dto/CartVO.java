package dto;

public class CartVO {
	private int cart_number;
	private String cart_name;
	private String cart_type;
	private String cart_content;
	private String cart_id;
	
	public String getCart_id() {
		return cart_id;
	}
	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}
	public int getCart_number() {
		return cart_number;
	}
	public void setCart_number(int cart_number) {
		this.cart_number = cart_number;
	}
	public String getCart_name() {
		return cart_name;
	}
	public void setCart_name(String cart_name) {
		this.cart_name = cart_name;
	}
	public String getCart_type() {
		return cart_type;
	}
	public void setCart_type(String cart_type) {
		this.cart_type = cart_type;
	}
	public String getCart_content() {
		return cart_content;
	}
	public void setCart_content(String cart_content) {
		this.cart_content = cart_content;
	}
}
