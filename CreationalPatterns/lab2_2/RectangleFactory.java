package lab2_2;

public class RectangleFactory implements Geometry_Factory {
    public Drawing drawGeometry(){
        System.out.println("绘图程序绘画长方形！");
        return new Rectangle();
    }
    public Drawing eraseGeometry(){
        System.out.println("绘图程序擦除长方形！");
        return new Rectangle();
    }
}
