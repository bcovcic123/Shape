package Shape.src;


public class Sphere extends ThreeDimShape{

	public Sphere(String name,int x, int y, int z) {
		super(name,x,y,z);
	}

	@Override
	public String toString() {
		return "Sphere [name=" + name + "]";
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
