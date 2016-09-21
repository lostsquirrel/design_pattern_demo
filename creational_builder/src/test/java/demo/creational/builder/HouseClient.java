package demo.creational.builder;

import demo.creational.builder.simple.House;
import demo.creational.builder.simple.creator.BrickBuilder;
import demo.creational.builder.simple.creator.HouseBuilder;
import demo.creational.builder.simple.creator.HouseDirector;
import demo.creational.builder.simple.creator.WoodBuilder;

public class HouseClient {
	public static void main(String[] args) {
		HouseDirector director = new HouseDirector();
		HouseBuilder woodBuilder = new WoodBuilder();
		BrickBuilder brickBuilder = new BrickBuilder();
		// Build a wooden house
		House woodHouse = director.construcHouse(woodBuilder);
		System.out.println(woodHouse);
		// Build a brick house
		House brickHouse = director.construcHouse(brickBuilder);
		System.out.println(brickHouse);
	}
}
