package demo.creational.factory.simple.factory;

import demo.creational.factory.simple.Product;
import demo.creational.factory.simple.ProductA;
import demo.creational.factory.simple.ProductB;

public class ProductFactory {
	public Product createProduct(String type) {
		if (type.equals("B"))
			return new ProductB();
		else
			return new ProductA();
	}
}
