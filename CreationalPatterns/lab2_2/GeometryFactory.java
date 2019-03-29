package lab2_2;

public class GeometryFactory {
	public static Drawing drawGeometry(String geometry) throws Exception
	 {
		 if(geometry.equalsIgnoreCase("Circle"))
	     {
			 System.out.println("绘图程序绘画圆形！");
			 return new Circle();
        }
        else if(geometry.equalsIgnoreCase("Rectangle"))
        {
            System.out.println("绘图程序绘画长方形！");
            return new Rectangle();
        }
        else if(geometry.equalsIgnoreCase("Square"))
        {
            System.out.println("绘图程序绘画正方形！");
            return new Square();
        }
        else
        {
            throw new Exception("绘图程序出现错误！");
        }
   }
	public static Drawing eraseGeometry(String geometry) throws Exception
	 {
		 if(geometry.equalsIgnoreCase("Circle"))
	     {
			 System.out.println("绘图程序擦除圆形！");
			 return new Circle();
       }
       else if(geometry.equalsIgnoreCase("Rectangle"))
       {
           System.out.println("绘图程序擦除长方形！");
           return new Rectangle();
       }
       else if(geometry.equalsIgnoreCase("Square"))
       {
           System.out.println("绘图程序擦除正方形！");
           return new Square();
       }
       else
       {
           throw new Exception("绘图程序出现错误！");
       }
  }
}
