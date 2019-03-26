package Shape.src;


public class Circle extends TwoDimShape{

	public Circle(String name, int length, int width) {
		super(name, length, width);
	}

	@Override
	public String toString() {
		return "Circle [name=" + name + "]";
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
