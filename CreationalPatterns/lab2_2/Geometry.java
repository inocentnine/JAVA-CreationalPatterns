package lab2_2;

public class Geometry {
	public static void main(String[] args) {
	    //简单工厂模式
		try
        {
            Drawing drawing,erasing;
            String geometryName=XMLUtilGeometry.getGeometryName();
            drawing=GeometryFactory.drawGeometry(geometryName);
            drawing.draw();
            erasing=GeometryFactory.eraseGeometry(geometryName);
            erasing.erase();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        //工厂方法模式
        try{
            Drawing drawing;
            Drawing erasing;
            Geometry_Factory factory;
            factory=(Geometry_Factory)XMLUtil.getBean();
            drawing=factory.drawGeometry();
            drawing.draw();
            erasing=factory.eraseGeometry();
            erasing.erase();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

	}
}
