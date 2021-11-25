package test;

import geometry.Point;

public class TestApp {

	public static void main(String[] args) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(3, 4);
		
		System.out.println(p1.distance(p2));

	}

}
