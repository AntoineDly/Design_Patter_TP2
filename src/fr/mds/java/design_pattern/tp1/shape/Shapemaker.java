package fr.mds.java.design_pattern.tp1.shape;

public class Shapemaker implements Draw {

	public Shapemaker()
	{}
	
	@Override
	public void drawCircle() {
		System.out.println("Circle::draw()");
		
	}

	@Override
	public void drawRectangle() {
		System.out.println("Rectangle::draw()");
		
	}

	@Override
	public void drawSquare() {
		System.out.println("Square::draw()");
		
	}

}
