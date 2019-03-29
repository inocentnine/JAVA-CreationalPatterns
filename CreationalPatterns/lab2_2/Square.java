package lab2_2;

public class Square implements Drawing{
	private double edgeLength;

	public double getEdgeLength() {
		return edgeLength;
	}

	public void setEdgeLength(double edgeLength) {
		this.edgeLength = edgeLength;
	}
	
	public void draw() {
		System.out.println("正方形绘画中......");
	}
	public void erase() {
		System.out.println("正方形擦除中......");
	}

}
