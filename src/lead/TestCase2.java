package lead;

public class TestCase2 
{
	public static void main(String[] args) 
	{
		String hungry = "Yes";
		
		if(hungry == "yes" || hungry =="Y" || hungry=="y")
			System.out.println("Eat something!");
		else {
			System.out.println("Do work");
		}
	}
}
