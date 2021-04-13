
//here we are creating blueprint of a Circle object
package shapes;
public class Circle {

	//data-members (variables for storing the property values of an object)
	private double radius, area, circumference;
	
	//methods (to perform operations on an object)
	public void setRadius(double r) {
		radius=r;
	}
	public void computeArea() {
		area = 3.14*radius*radius;
		System.out.println("Area of Circle  : "+area);
	}
	public void computeCircumference() {
		circumference=2*3.14*radius;
		System.out.println("Circumference of Circle : "+circumference);
	}
	
}
