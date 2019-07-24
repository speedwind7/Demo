package net.onest.server.entity;

public class ShoppingCart {
	private int id;
	private int pid;
	private int uid;
	private String productName;
	private String image;
	private int price;
	
	
		
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ShoppingCart(int pid, int uid) {
		super();
		this.pid = pid;
		this.uid = uid;
	}
	public ShoppingCart() {
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}
	

	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", pid=" + pid + ", uid=" + uid + "]";
	}
	

}
