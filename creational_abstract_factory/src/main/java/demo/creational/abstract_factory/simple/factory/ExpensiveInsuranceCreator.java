package demo.creational.abstract_factory.simple.factory;

import demo.creational.abstract_factory.simple.CarInsurance;
import demo.creational.abstract_factory.simple.ExpensiveCarInsurance;
import demo.creational.abstract_factory.simple.ExpensiveHomeInsurance;
import demo.creational.abstract_factory.simple.ExpensivePersonalInsurance;
import demo.creational.abstract_factory.simple.HomeInsurance;
import demo.creational.abstract_factory.simple.PersonalInsurance;

public class ExpensiveInsuranceCreator extends InsuranceCreator {

	@Override
	public CarInsurance createCarInsurance() {
		return new ExpensiveCarInsurance();
	}

	@Override
	public HomeInsurance createHomeInsurance() {
		return new ExpensiveHomeInsurance();
	}

	@Override
	public PersonalInsurance createPersonalInsurance() {
		return new ExpensivePersonalInsurance();
	}

}
