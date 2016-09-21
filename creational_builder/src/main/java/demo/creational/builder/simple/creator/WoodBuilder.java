package demo.creational.builder.simple.creator;

import demo.creational.builder.simple.Floor;
import demo.creational.builder.simple.House;
import demo.creational.builder.simple.Roof;
import demo.creational.builder.simple.Walls;
import demo.creational.builder.simple.WoodFloor;
import demo.creational.builder.simple.WoodHouse;
import demo.creational.builder.simple.WoodRoof;
import demo.creational.builder.simple.WoodWalls;

public class WoodBuilder extends HouseBuilder {
	public Floor createFloor() {
		floor = new WoodFloor();
		return floor;
	}

	public House createHouse() {
		house = new WoodHouse();
		return house;
	}

	public Roof createRoof() {
		roof = new WoodRoof();
		return roof;
	}

	public Walls createWalls() {
		walls = new WoodWalls();
		return walls;
	}
}
