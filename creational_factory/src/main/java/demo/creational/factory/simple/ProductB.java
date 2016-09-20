package demo.creational.factory.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductB extends Product {
	
	private static final Logger log = LoggerFactory.getLogger(ProductB.class);
	
	public void writeName(String name) {
		StringBuilder tempName = new StringBuilder().append(name);
		log.debug("My reversed name is " + tempName.reverse());
	}
}
