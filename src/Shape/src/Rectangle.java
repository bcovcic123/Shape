package Shape.src;


public class Rectangle extends TwoDimShape {

	public Rectangle(String name, int length, int width) {
		super(name, length, width);
	}

	@Override
	public String toString() {
		return "Rectangle [name=" + name + "]";
	}

	@Override
	public double Area() {
		return length * width;
	}

	@Override
	public void Draw() {
		System.out.println("Drawing : " + name);
	}

}
