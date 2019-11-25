package ejercicios;

public class Producto {
	private String name;
	private String brand;
	private String model;
	private double price;
	private int stock;
	private String type;
	
	//CONSTRUCTORES
	public Producto() {
	}
	
	public Producto(String name, String brand, String model, double price, int stock, String type) {
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.stock = stock;
		this.type = type;
		System.out.println("Bob el constructor ha construido un " + this.type );
	}
	
	//SETTERS
	public void setName(String name) {
		this.name = name;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//GETTERS
	public String getName() {
		return this.name;
	}
	public String getBrand() {
		return this.brand;
	}
	public String getModel() {
		return this.model;
	}
	public double getPrice() {
		return this.price;
	}
	public int getStock() {
		return this.stock;
	}
	public String getType() {
		return this.type;
	}
}