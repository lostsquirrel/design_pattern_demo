package creational_factory.simple.factory;

import creational_factory.simple.Product;
import creational_factory.simple.ProductA;
import creational_factory.simple.ProductB;

public class ProductFactory {
	public Product createProduct(String type) {
		if (type.equals("B"))
			return new ProductB();
		else
			return new ProductA();
	}
}
