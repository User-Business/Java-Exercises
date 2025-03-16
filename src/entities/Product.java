package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity; //Quando usamos o this estamos referenciando a atributo do objeto em questão no caso o quantity que criamos para a classe
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity; //Quando usamos o this estamos referenciando a atributo do objeto em questão no caso o quantity que criamos para a classe
	}
	
	public void showInformationUpdated() {
		System.out.println("updated data: " + toString() );
	}
	
	public void showInformation() {
		System.out.println("Product data: " + toString());
	}
	
	
	public String toString() {
		return name
			+ ", $ " 
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, total $ "
			+ String.format("%.2f", totalValueInStock());
	}
	
	
	
	
}
