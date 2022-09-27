package javaBootCamp_classesWithAttributes;

public class Product {
	public Product (int id, String name, String description, double price, int stockAmount , String color) {
		System.out.println("yapıcı blok çalıştı");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.color = color;
	}
	//attribute
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String code;
	
	//getter
	public int getId() {
		return id;
	}
	//setter
	public int setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public String setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public double setPrice(String price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public int setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getColor() {
		return color;
	}
	public String setColor(String color) {
		this.color = color;
	}
	public String getCode() {
		return this.name.substring(0,1) + id;
	}

}
