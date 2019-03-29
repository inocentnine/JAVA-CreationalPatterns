package lab2_2;

public class CircleFactory implements Geometry_Factory{
    public Drawing drawGeometry(){
        System.out.println("绘图程序绘画圆形！");
        return new Circle();
    }
    public Drawing eraseGeometry(){
        System.out.println("绘图程序擦除圆形！");
        return new Circle();
    }
}
