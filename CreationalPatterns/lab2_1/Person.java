package lab2_1;

public class Person {

	public static void main(String[] args) {
		try
        {
            Nvwa nvwa;
            String sexName=XMLUtilPerson.getSexName();
            nvwa=PersonFactory.producePerson(sexName);
            nvwa.produce();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

	}

}
