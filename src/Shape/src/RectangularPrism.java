package Shape.src;


public class RectangularPrism extends ThreeDimShape{

	public RectangularPrism(String name,int x, int y, int z) {
		super(name,x,y,z);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RectangularPrism [name=" + name + "]";
	}

	@Override
	public double Area() {
		return x*y*z;
	}

	@Override
	public void Draw() {
		System.out.println("Drawing : " + name);
	}

}
