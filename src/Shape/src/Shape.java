package Shape.src;


public class Shape {

	String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public double Area() {
		System.out.println("Shape unknown");
	    return 0;
	}
	
	public void Draw() {
		System.out.println("Drawing Shape");
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}


	
}
