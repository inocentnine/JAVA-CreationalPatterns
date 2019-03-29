package lab2_2;

public class Circle implements Drawing{
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("圆形绘画中......");
	}
	public void erase() {
		System.out.println("圆形擦除中......");
	}
}
