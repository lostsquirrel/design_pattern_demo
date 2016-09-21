package demo.creational.abstract_factory;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import demo.creational.abstract_factory.simple.factory.InsuranceCreator;

public class InsuranceCreatorDemo {

	private static final Logger log = LoggerFactory.getLogger(InsuranceCreatorDemo.class);
	
	@Test
	public void testName() throws Exception {
		String[] types = new String[]{"cheap", "expensive", "scam"};
		for (String type: types) {
			log.debug(String.format("start to create %s insurance objects", type));
			InsuranceCreator creator = InsuranceCreator.createInsuranceCreator(type);
			log.debug(getClassName(creator));
			log.debug(getClassName(creator.createCarInsurance()));
			log.debug(getClassName(creator.createHomeInsurance()));
			log.debug(getClassName(creator.createPersonalInsurance()));
		}
	}
	
	private String getClassName(Object obj) {
		return obj.getClass().getName();
	}
}
