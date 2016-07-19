public class Factorial 
{

	public static void main(String[] args) 
	{ 
 int n=1;
 int i;
 i=Integer.parseInt(args[0]);
 while(i>0)
 {
	 n=n*i;
	 i=i-1;
	
 }
 System.out.println(" The factorial is "+n);
	}

}
