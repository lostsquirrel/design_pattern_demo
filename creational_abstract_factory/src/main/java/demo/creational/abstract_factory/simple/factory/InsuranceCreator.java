package demo.creational.abstract_factory.simple.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import demo.creational.abstract_factory.simple.CarInsurance;
import demo.creational.abstract_factory.simple.HomeInsurance;
import demo.creational.abstract_factory.simple.PersonalInsurance;

public abstract class InsuranceCreator {

	public static InsuranceCreator createInsuranceCreator(String type) throws Exception {
		Map<String, Callable<InsuranceCreator>> initors = new HashMap<>();
		initors.put("cheap", CheapInsuranceCreator::new);
		initors.put("expensive", ExpensiveInsuranceCreator::new);
		initors.put("scam", ScamInsuranceCreator::new);
		return initors.get(type).call();
	}
	
	public abstract CarInsurance createCarInsurance();
	
	public abstract HomeInsurance createHomeInsurance();
	
	public abstract PersonalInsurance createPersonalInsurance();
}
