package _03类的成员变量是引用类型;

public class Phone {
	private int price;
	private String brand;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Phone(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	
	public Phone() {}
}
