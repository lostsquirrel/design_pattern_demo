package creational_factory.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Product {
	
	private static final Logger log = LoggerFactory.getLogger(Product.class);
	
	public void writeName(String name) {
		log.debug("My name is " + name);
	}
}
