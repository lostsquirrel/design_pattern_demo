package demo.creational.abstract_factory.simple.factory;

import demo.creational.abstract_factory.simple.CarInsurance;
import demo.creational.abstract_factory.simple.CheapCarInsurance;
import demo.creational.abstract_factory.simple.CheapHomeInsurance;
import demo.creational.abstract_factory.simple.CheapPersonalInsurance;
import demo.creational.abstract_factory.simple.HomeInsurance;
import demo.creational.abstract_factory.simple.PersonalInsurance;

public class CheapInsuranceCreator extends InsuranceCreator {

	@Override
	public CarInsurance createCarInsurance() {
		return new CheapCarInsurance();
	}

	@Override
	public HomeInsurance createHomeInsurance() {
		return new CheapHomeInsurance();
	}

	@Override
	public PersonalInsurance createPersonalInsurance() {
		return new CheapPersonalInsurance();
	}

}
