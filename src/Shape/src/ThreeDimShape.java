package Shape.src;


public class ThreeDimShape extends Shape{
	
	int x,y,z;

	public ThreeDimShape(String name,int x,int y, int z) {
		super(name);
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "ThreeDimShape [name=" + name + "]";
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
