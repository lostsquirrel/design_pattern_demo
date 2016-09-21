package demo.creational.builder.simple.creator;

import demo.creational.builder.simple.BrickFloor;
import demo.creational.builder.simple.BrickHouse;
import demo.creational.builder.simple.BrickRoof;
import demo.creational.builder.simple.BrickWalls;
import demo.creational.builder.simple.Floor;
import demo.creational.builder.simple.House;
import demo.creational.builder.simple.Roof;
import demo.creational.builder.simple.Walls;

public class BrickBuilder extends HouseBuilder {

	public Floor createFloor() {
		floor = new BrickFloor();
		return floor;
	}

	public House createHouse() {
		house = new BrickHouse();
		return house;
	}

	public Roof createRoof() {
		roof = new BrickRoof();
		return roof;
	}

	public Walls createWalls() {
		walls = new BrickWalls();
		return walls;
	}
}
