package lab2_2;

public class SquareFactory implements Geometry_Factory {
    public Drawing drawGeometry(){
        System.out.println("绘图程序绘画正方形！");
        return new Square();
    }
    public Drawing eraseGeometry(){
        System.out.println("绘图程序擦除正方形！");
        return new Square();
    }
}
