package demo.creational.factory.simple;

import demo.creational.factory.simple.Product;
import demo.creational.factory.simple.factory.ProductFactory;

public class TestClientFactory {

	public static void main(String[] args) {
		ProductFactory pf = new ProductFactory();
		Product prod;
		prod = pf.createProduct("A");
		prod.writeName("John Doe");
		prod = pf.createProduct("B");
		prod.writeName("John Doe");
	}
}
