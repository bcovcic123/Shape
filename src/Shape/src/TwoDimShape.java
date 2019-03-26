package Shape.src;


public class TwoDimShape extends Shape{

	int length,width;
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public TwoDimShape(String name, int length, int width) {
		super(name);
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return "TwoDimShape [name=" + name + "]";
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
