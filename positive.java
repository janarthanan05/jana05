public class Positive 
{
public static void main(String args[])
{
	int a;
	a=Integer.parseInt(args[0]);
	if(a<0)
	{
		System.out.println(+a+" is a negative number");
	}
	else if(a>0)
	{
		System.out.println(+a+" is a positive number");
	}
	else
	{
		System.out.println("The number is zero");
	}
}
}
