package demo.creational.abstract_factory.simple.factory;

import demo.creational.abstract_factory.simple.CarInsurance;
import demo.creational.abstract_factory.simple.HomeInsurance;
import demo.creational.abstract_factory.simple.PersonalInsurance;
import demo.creational.abstract_factory.simple.ScamCarInsurance;
import demo.creational.abstract_factory.simple.ScamHomeInsurance;
import demo.creational.abstract_factory.simple.ScamPersonalInsurance;

public class ScamInsuranceCreator extends InsuranceCreator {

	@Override
	public CarInsurance createCarInsurance() {
		return new ScamCarInsurance();
	}

	@Override
	public HomeInsurance createHomeInsurance() {
		return new ScamHomeInsurance();
	}

	@Override
	public PersonalInsurance createPersonalInsurance() {
		return new ScamPersonalInsurance();
	}

}
