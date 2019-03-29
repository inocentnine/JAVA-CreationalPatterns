package lab2_2;

public class Rectangle implements Drawing{
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void draw() {
		System.out.println("矩形绘画中......");
	}
	public void erase() {
		System.out.println("矩形擦除中......");
	}

}
