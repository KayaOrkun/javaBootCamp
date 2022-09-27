package javaBootCamp_classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(id 1, name "laptop", description "asus", price 3000, stockAmount 2, color "black");
		//product.setName("laptop");
		//product.setId(1);
		//product.setDescription("Asus");
		//product.setPrice(5000);
		//product.setStockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		System.out.println(product.getCode());
		
	}

}
