package digits;
import java.util.Scanner;
public class ss 
{
	public static void main(String[] args) 
	{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first string");
String b=s.nextLine();
System.out.println("Enter the string to be checked as a substring");
String c=s.nextLine();
if(b.contains(c)){
System.out.println("c is a substring of b");
}else{
	System.out.println("c is not a substring");
}
s.close();
	}
