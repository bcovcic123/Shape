package Shape.src;


public class Test {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("This is a simple shape");
		System.out.println(s1.toString());
		Shape s2 = new TwoDimShape("This is a Two Dimensional shape",1,1);
		System.out.println(s2.toString());
		Shape s3 = new ThreeDimShape("This is a Three Dimensional shape",1,2,3);
		System.out.println(s3.toString());
		TwoDimShape s4 = new Rectangle("This is a Rectangle",4,4);
		System.out.println(s4.toString());
		System.out.println("Area : " + s4.Area());
		TwoDimShape s5 = new Circle("This is a Circle",6,8);
		System.out.println(s5.toString());
		System.out.println("Area : " + s5.Area());
		ThreeDimShape s6 = new RectangularPrism("This is a RectangularPrism",4,5,6);
		System.out.println(s6.toString());
		System.out.println(s6.Area());
		ThreeDimShape s7 = new Sphere("This is a Sphere",7,8,9);
		System.out.println(s7.toString());
		System.out.println(s7.Area());
		
		
	}

}
