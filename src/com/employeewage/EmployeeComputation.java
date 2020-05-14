import java.util.Random;
import java.io.*;
class EmployeeComputation
{

	public static boolean isPresent()
	{
		Random rand=new Random();
		int random=rand.nextInt(50)%2;
		return random==1?true:false; 
	}

	public static void main(String[] args)
		{
		System.out.println("Computation Program");
			if(isPresent())
			{
			System.out.println("Employee is Present");
			}
			else
			{
			System.out.println("Employee is Absent");
			}
		}
}
