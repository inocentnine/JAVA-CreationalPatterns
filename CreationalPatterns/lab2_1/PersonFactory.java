package lab2_1;

public class PersonFactory {
	 public static Nvwa producePerson(String sex) throws Exception
	 {
		 if(sex.equalsIgnoreCase("M"))
	     {
			 System.out.println("女娲再创造男人！");
			 return new Man();
         }
         else if(sex.equalsIgnoreCase("W"))
         {
             System.out.println("女娲再创造女人！");
             return new Woman();
         }
         else if(sex.equalsIgnoreCase("R"))
         {
             System.out.println("女娲再创造机器人！");
             return new Robot();
         }
         else
         {
             throw new Exception("对不起，我还是一块泥巴！");
         }
    }

}
