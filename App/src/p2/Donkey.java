package p2;

import p1.Movable;

public class Donkey implements Movable {

	int location = 200 ;
	@Override
	public void move(int by) {
		location = location + by;
	}

	@Override
	public void moveBack(int by) {
		location = location - by;
	}

}
