package colllectionLearning;

public class Laptop {
	String name;
	int price;
	int gb;
	boolean touch;
	public Laptop(String name,int price, int gb, boolean touch) {
		super();
		this.name=name;
		this.price = price;
		this.gb = gb;
		this.touch = touch;
	}
	
	@Override
	public String toString() {
		return this.name+" "+ this.price +" "+ this.gb +" "+ this.touch;
	}
	

}
